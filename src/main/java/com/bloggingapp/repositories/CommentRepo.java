package com.bloggingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggingapp.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
