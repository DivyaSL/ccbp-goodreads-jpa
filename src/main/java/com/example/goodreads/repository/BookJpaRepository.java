package com.example.goodreads.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import com.example.goodreads.model.*;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {
    
}