package com.myjava.sharebook.borrow;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("borrows")
public class BorrowController {
    @GetMapping
    public ResponseEntity getMyBorrows() {
        Borrow borrow = new Borrow();
        borrow.setAskDate(LocalDate.now());
        return new ResponseEntity(List.of(borrow), HttpStatus.OK);
    }

    @PostMapping(value = "/{bookId}")
    public ResponseEntity createBorrow(@PathVariable("bookId") String bookId) {
        // TODO : Persist
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{borrowId}")
    public ResponseEntity delBook(@PathVariable("borrowId") String borrowId) {
        // TODO : Persist
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
