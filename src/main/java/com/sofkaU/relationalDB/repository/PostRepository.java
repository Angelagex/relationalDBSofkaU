package com.sofkaU.relationalDB.repository;

import com.sofkaU.relationalDB.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
