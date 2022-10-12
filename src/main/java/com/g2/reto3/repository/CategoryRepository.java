package com.g2.reto3.repository;

import com.g2.reto3.entities.Category;
import com.g2.reto3.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    public Optional<Category> getCategory(int id){ // traer categorias
        return categoryCrudRepository.findById(id);
    }
    public Category save(Category ca){
        return categoryCrudRepository.save(ca);
    }
    public void delete (Category ca){
        categoryCrudRepository.delete(ca);
    }

}
