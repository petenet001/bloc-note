package cg.rcksoft.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Note {

    private Long id;
    private String title;
    private String description;
    private java.util.Date dateEditNote;

    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    public Note(Long id, String title, String description, java.util.Date dateEditNote) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateEditNote = dateEditNote;
    }

    /**
     * get new instance
     */
    public static void newInstance(){
        new Note();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getDateEditNote() {
        return dateEditNote;
    }

    public void setDateEditNote(java.util.Date dateEditNote) {
        this.dateEditNote = dateEditNote;
    }

}
