package com.g2.reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "costume")
public class Costume implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement del id
    private Integer id;
    @Column(name = "name",nullable = false, length = 45)
    private String name;
    @Column(name = "brand",nullable = false, length = 45)
    private String brand;
    @Column(name = "years",nullable = false, length = 45) // deben ser un número de 4 dígitos que representa un año calendario.
    private Integer year;
    @Column(name = "description",nullable = false, length = 205)
    private String description;

    @ManyToOne // indica la relación de muchos costumes a una categoría.
    @JoinColumn(name = "CategoryId")
    @JsonIgnoreProperties("costumes")//cuándo imprima ignora Costumes
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "costume")
    @JsonIgnoreProperties({"costume","messages"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "costume")
    @JsonIgnoreProperties({"costume", "client"})
    private List<Reservation> reservations;


    public Costume(Integer id, String name, String brand, Integer year, String description, Category category, List<Message> messages, List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.category = category;
        this.messages = messages;
        this.reservations = reservations;
    }

    public Costume() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
