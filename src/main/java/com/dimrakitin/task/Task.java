package com.dimrakitin.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
    
    @Id
    @GeneratedValue
    private Long id;

    private String text;
    private Boolean isDone;
    
    
    public Task(Long id, String text, Boolean isDone) {
        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }

    public Task(String text, Boolean isDone) {
        this(null, text, isDone);
    }

    public Task(String text) {
        this(null, text, false);
    }

    public Task() {
        this(null, "", false);
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
    
    public Boolean getIsDone() {
        return isDone;
    }
    
    
    @Override
    public String toString() {
        return "Task{"
                + "id='" + id + '\''
                + ", text=" + text
                + ", isDone=" + isDone
                + '}';
    }
}
