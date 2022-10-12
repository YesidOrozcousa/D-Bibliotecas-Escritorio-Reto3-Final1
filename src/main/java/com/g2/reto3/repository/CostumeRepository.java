package com.g2.reto3.repository;

import com.g2.reto3.entities.Costume;
import com.g2.reto3.repository.crudRepository.CostumeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CostumeRepository {

    @Autowired
    private CostumeCrudRepository costumeCrudRepository;

    public List<Costume> getAll(){
        return (List<Costume>) costumeCrudRepository.findAll();
    }
    public Optional<Costume> getCostume(int id){
        return costumeCrudRepository.findById(id);
    }
    public Costume save (Costume co){
        return costumeCrudRepository.save(co);
    }
    public void delete (Costume co){
        costumeCrudRepository.delete(co);
    }
}
