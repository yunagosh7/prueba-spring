package com.yunagosh.pruebasping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class UserTask {

    @Column(name = "task_name")
    private Integer taskName;

    @Column(name = "name")
    private String username;

    @Column(name = "email")
    private Integer userEmail;

    public Integer getTaskName() {
        return taskName;
    }

    public void setTaskName(Integer taskName) {
        this.taskName = taskName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Integer userEmail) {
        this.userEmail = userEmail;
    }
}
