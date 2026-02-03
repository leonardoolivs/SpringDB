package org.estudos.spring.configs;

import org.estudos.spring.entities.Post;
import org.estudos.spring.entities.User;
import org.estudos.spring.repositories.PostRepository;
import org.estudos.spring.repositories.UserRepository;
import org.estudos.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ConfigTest implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PostRepository postRepo;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@hotmail.com");
        User u2 = new User(null, "Alex", "alex@hotmail.com");
        User u3 = new User(null, "Bob", "bob@hotmail.com");

        userRepo.deleteAll();

        userRepo.saveAll(Arrays.asList(u1, u2));

        Post p1 = new Post(null, LocalDate.parse("21/03/2018", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Partiu viagem", "Vou viajar", u1);
        Post p2 = new Post(null, LocalDate.parse("23/03/2018", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Bom dia", "Acordei feliz", u1);

        postRepo.deleteAll();
        
        postRepo.saveAll(Arrays.asList(p1, p2));

    }
}
