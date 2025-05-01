package com.pedrosts.dev.course.resources;

import com.pedrosts.dev.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALl() {
        User u = new User(1L, "Pedro", "pedro@gmail.com", "1234567", "1234");
        return ResponseEntity.ok().body(u);
    }
}
