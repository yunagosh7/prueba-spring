package com.yunagosh.pruebasping;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer id_user;

    private String name;

    private String email;


    public Integer getId() {
        return id_user;
    }

    public void setId(Integer id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
