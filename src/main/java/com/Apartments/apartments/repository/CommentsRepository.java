package com.Apartments.apartments.repository;

import com.Apartments.apartments.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment,Integer>
{
}
