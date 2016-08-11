package cg.rcksoft.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table EVENT.
 */
public class Event {

    private Long id;
    private String events;
    private java.util.Date dateEditEvent;
    private java.util.Date dateAlertEvent;
    private java.util.Date heureAlertEvent;

    public Event() {
    }

    public Event(Long id) {
        this.id = id;
    }

    public Event(Long id, String events, java.util.Date dateEditEvent, java.util.Date dateAlertEvent, java.util.Date heureAlertEvent) {
        this.id = id;
        this.events = events;
        this.dateEditEvent = dateEditEvent;
        this.dateAlertEvent = dateAlertEvent;
        this.heureAlertEvent = heureAlertEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public java.util.Date getDateEditEvent() {
        return dateEditEvent;
    }

    public void setDateEditEvent(java.util.Date dateEditEvent) {
        this.dateEditEvent = dateEditEvent;
    }

    public java.util.Date getDateAlertEvent() {
        return dateAlertEvent;
    }

    public void setDateAlertEvent(java.util.Date dateAlertEvent) {
        this.dateAlertEvent = dateAlertEvent;
    }

    public java.util.Date getHeureAlertEvent() {
        return heureAlertEvent;
    }

    public void setHeureAlertEvent(java.util.Date heureAlertEvent) {
        this.heureAlertEvent = heureAlertEvent;
    }

}
