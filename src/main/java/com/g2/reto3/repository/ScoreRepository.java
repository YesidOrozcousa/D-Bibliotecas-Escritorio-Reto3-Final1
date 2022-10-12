package com.g2.reto3.repository;

import com.g2.reto3.entities.Score;
import com.g2.reto3.repository.crudRepository.ScoreCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {

    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }
    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }
    public Score save (Score sc){
        return scoreCrudRepository.save(sc);
    }
    public void delete (Score sc){
        scoreCrudRepository.delete(sc);
    }
}
