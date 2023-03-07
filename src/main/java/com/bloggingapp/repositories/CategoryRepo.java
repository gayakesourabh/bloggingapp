package com.bloggingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggingapp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
