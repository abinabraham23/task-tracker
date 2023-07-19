package com.test.tracker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskId;
    private String owner;
    private String timeConsumed;
    private String difficulty;
    private String comment;

    public TaskEntry(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getTimeConsumed() {
        return timeConsumed;
    }
    public void setTimeConsumed(String timeConsumed) {
        this.timeConsumed = timeConsumed;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public TaskEntry(Long id, String taskId, String owner, String timeConsumed, String difficulty, String comment) {
        this.id = id;
        this.taskId = taskId;
        this.owner = owner;
        this.timeConsumed = timeConsumed;
        this.difficulty = difficulty;
        this.comment = comment;
    }

    // Constructors, getters, and setters
}
