package com.g2.reto3.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement del id
    private Integer idAdmin;
    private String name;
    private String email;
    private String password;

    public Admin(Integer idAdmin, String name, String email, String password) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Admin() {

    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
