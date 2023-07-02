package com.myjava.sharebook.borrow;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Integer> {
    List<Borrow> findByBorrower_Id(int borrower_Id);
    List<Borrow> findByBook_Id(int bookId);
}
