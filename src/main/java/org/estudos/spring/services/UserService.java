package org.estudos.spring.services;

import org.estudos.spring.entities.User;
import org.estudos.spring.exceptions.ObjectNotFoundException;
import org.estudos.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException(id));
    }

    public User create(User user){

        return repo.save(user);
    }
}
