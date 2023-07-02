package com.myjava.sharebook.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByStatusAndUser_IdNotAndDeletedFalse(BookStatus status, int userId);

    List<Book> findByUser_IdAndDeletedFalse(int userId);
}
