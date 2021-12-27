package com.dimrakitin.task;

public class Task {
    private Long id;
    private String text;
    private Boolean isDone;
    
    
    public Task(Long id, String text, Boolean isDone) {
        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }

    public Task(String text, Boolean isDone) {
        this(-1L, text, isDone);
    }

    public Task(String text) {
        this(-1L, text, false);
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
}
