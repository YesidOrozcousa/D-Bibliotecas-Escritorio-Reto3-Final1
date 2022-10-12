package com.g2.reto3.service;

import com.g2.reto3.entities.Score;
import com.g2.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return scoreRepository.getAll();
    }

    public Optional<Score> getScore(int id){
        return scoreRepository.getScore(id);
    }

    public Score save(Score d){
        if(d.getId()==null){
            return scoreRepository.save(d);
        }else{
            Optional<Score> e= scoreRepository.getScore(d.getId());
            if(e.isPresent()){
                return d;
            }else{
                return scoreRepository.save(d);
            }
        }
    }

    public Score update(Score p){
        if(p.getId()!=null){
            Optional<Score> q = scoreRepository.getScore(p.getId());
            if (q.isPresent()){
                scoreRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }

    public boolean delete(int id){
        boolean flag=false;
        Optional<Score>p= scoreRepository.getScore(id);
        if (p.isPresent()){
            scoreRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}
