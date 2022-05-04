package com.sofkaU.relationalDB.repository;

import com.sofkaU.relationalDB.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>
{
}
