package org.estudos.spring.configs;

import org.estudos.spring.entities.User;
import org.estudos.spring.repositories.UserRepository;
import org.estudos.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ConfigTest implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Solo", "solo@hotmail.com");
        User u2 = new User(null, "Dri", "adriana@hotmail.com");

        repo.deleteAll();

        repo.saveAll(Arrays.asList(u1, u2));

    }
}
