package org.estudos.spring.controllers;

import org.apache.coyote.Response;
import org.estudos.spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User u1 = new User("1", "Leonardo", "leonardo@hotmail.com");
        List<User> lista = new ArrayList<>();

        lista.add(u1);

        return ResponseEntity.ok().body(lista);
    }
}
