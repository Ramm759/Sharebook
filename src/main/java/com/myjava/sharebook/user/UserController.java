package com.myjava.sharebook.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @PostMapping
    public ResponseEntity addUser(User user) {
        // TODO : Persist
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
