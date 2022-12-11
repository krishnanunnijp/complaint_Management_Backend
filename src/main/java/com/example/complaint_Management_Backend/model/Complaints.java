package com.example.complaint_Management_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaints {

    @Id
    @GeneratedValue()
    private int id;
    private int userId;
    private String complaints;

    public Complaints() {
    }

    public Complaints(int id, int userId, String complaints) {
        this.id = id;
        this.userId = userId;
        this.complaints = complaints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }
}
