package com.g2.reto3.repository;

import com.g2.reto3.entities.Reservation;
import com.g2.reto3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }
    public Reservation save (Reservation re){
        return reservationCrudRepository.save(re);
    }
    public void delete (Reservation re){
        reservationCrudRepository.delete(re);
    }
}
