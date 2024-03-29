package com.myjava.sharebook.book;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @GetMapping
    public ResponseEntity listBooks() {
        Book myBook = new Book();
        myBook.setTitle("toto");
        myBook.setCategory(new Category("Thriller"));
        return new ResponseEntity(List.of(myBook), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBook(@Valid @RequestBody Book book){
        // TODO : Persist
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{bookId}")
    public ResponseEntity delBook(@PathVariable("bookId") String bookId){
        // TODO : Persist
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/{bookId}")
    public ResponseEntity updateBook(@PathVariable("bookId") String bookId, @RequestBody Book book){
        // TODO : Persist
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity listCategories() {
       Category category = new Category("Thriller");
        return new ResponseEntity(List.of(category), HttpStatus.OK);
    }
}
