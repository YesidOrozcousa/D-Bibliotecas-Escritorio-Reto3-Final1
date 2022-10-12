package com.g2.reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")

public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement del id
    private Integer idClient; // cuándo trabajamos con Jpa no debemos poner el tipo de dato primitivo
    @Column(name = "email", nullable = false, length = 45)
    private String email;
    @Column(name = "password",nullable = false, length = 45)
    private String password;
    @Column(name = "name",nullable = false, length = 250)
    private String name;
    private Integer age;




    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation>reservations;


    public Client(Integer idClient, String name, Integer age, String password, String email, List<Message> messages, List<Reservation> reservations) {
        this.idClient = idClient;
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
        this.messages = messages;
        this.reservations = reservations;
    }

    public Client() {

    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
