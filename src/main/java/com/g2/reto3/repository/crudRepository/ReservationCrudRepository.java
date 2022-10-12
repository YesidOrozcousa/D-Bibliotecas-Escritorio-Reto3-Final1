package com.g2.reto3.repository.crudRepository;

import com.g2.reto3.entities.Reservation;
import com.g2.reto3.repository.ReservationRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
