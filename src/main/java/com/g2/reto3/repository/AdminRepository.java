package com.g2.reto3.repository;

import com.g2.reto3.entities.Admin;
import com.g2.reto3.repository.crudRepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }
    public Optional<Admin> getAdmin(int id){
        return adminCrudRepository.findById(id);
    }
    public Admin save (Admin ad){
        return adminCrudRepository.save(ad);
    }
    public void delete (Admin ad){
        adminCrudRepository.delete(ad);
    }
}
