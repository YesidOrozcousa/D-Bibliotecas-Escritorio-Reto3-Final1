package com.g2.reto3.repository;

import com.g2.reto3.entities.Message;
import com.g2.reto3.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }
    public Message save (Message ms){
        return messageCrudRepository.save(ms);
    }
    public void delete (Message ms){
        messageCrudRepository.delete(ms);
    }
}
