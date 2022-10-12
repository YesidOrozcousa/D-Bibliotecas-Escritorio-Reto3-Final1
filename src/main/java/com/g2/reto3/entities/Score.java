package com.g2.reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer  points;

   @OneToOne
   @JsonIgnoreProperties("scores")
   private Reservation reservation;

    public Score(Integer id, Integer points, Reservation reservation) {
        this.id = id;
        this.points = points;
        this.reservation = reservation;
    }

    public Score() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Reservation getReservations() {
        return reservation;
    }

    public void setReservations(Reservation reservations) {
        this.reservation = reservations;
    }
}
