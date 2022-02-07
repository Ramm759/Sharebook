package com.mycompany.sharebook.backend.repository;

import com.mycompany.sharebook.backend.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
