package cg.rcksoft.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Date;

import cg.rcksoft.app.tools.AppConfig;
import cg.rcksoft.data.Note;
import cg.rcksoft.data.NoteDao;

public class AddNoteActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private ImageView save;
    private ViewGroup note_ly;
    private EditText edtTitle, edtNote;

    private NoteDao noteDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        noteDao = (NoteDao) AppConfig.getReadableDatabase(Note.class);

        setUpView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        /*edtNote.setText("");
        edtTitle.setText("");*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void setUpView(){

        toolbar = (Toolbar)findViewById(R.id.toolbar2);
        note_ly = (LinearLayout)findViewById(R.id.note_ly_2);
        save = (ImageView)findViewById(R.id.save);
        edtTitle = (EditText)findViewById(R.id.edit_note_title);
        edtNote = (EditText)findViewById(R.id.edit_note);

        note_ly.setOnClickListener(this);
        save.setOnClickListener(this);

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    private Note getNote(){
        Note note = new Note();
        note.setTitle(edtTitle.getText().toString());
        note.setDescription(edtNote.getText().toString());
        note.setDateEditNote(new Date());
        return note;
    }

    private void addNote(){
        noteDao.insertInTx(getNote());
        setResult(RESULT_OK);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.note_ly_2:{
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.save:{
                if(!(getNote().getDescription().trim().equals("") && getNote().getTitle().trim().equals(""))){
                    addNote();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("success", getNote().getTitle());
                    startActivityForResult(intent, RESULT_OK);
                    break;
                }

            }
        }
    }
}
