package com.example.magidash.Entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "dashboards")
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="createdAt")
    private Date createdAt;
    @Column(name ="updatedAt")
    private Date updatedAt;
    @Column(name ="title")
    private String title;

    public Dashboard(){}

    public Dashboard(Date createdAt, Date updatedAt, String title) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", title='" + title + '\'' +
                '}';
    }
}
