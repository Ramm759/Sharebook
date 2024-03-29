package com.myjava.sharebook.user;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @PostMapping
    public ResponseEntity addUser(@Valid @RequestBody User user) {
        // TODO : Persist
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
