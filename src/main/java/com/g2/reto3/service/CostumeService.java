package com.g2.reto3.service;

import com.g2.reto3.entities.Costume;
import com.g2.reto3.repository.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostumeService {

    @Autowired
    private CostumeRepository costumeRepository;

    public List<Costume> getAll(){
        return costumeRepository.getAll();
    }

    public Optional<Costume> getCostume(int id){
        return costumeRepository.getCostume(id);
    }

    public Costume save(Costume d){
        if(d.getId()==null){
            return costumeRepository.save(d);
        }else{
            Optional<Costume> e= costumeRepository.getCostume(d.getId());
            if(e.isPresent()){
                return d;
            }else{
                return costumeRepository.save(d);
            }
        }
    }

    public Costume update(Costume p){
        if(p.getId()!=null){
            Optional<Costume> q = costumeRepository.getCostume(p.getId());
            if (q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }
                if(p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }
                costumeRepository.save(q.get());
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
        Optional<Costume>p= costumeRepository.getCostume(id);
        if (p.isPresent()){
            costumeRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}
