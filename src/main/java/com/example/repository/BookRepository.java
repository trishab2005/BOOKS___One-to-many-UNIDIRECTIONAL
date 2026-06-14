package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByTitle(String title);
    List<Book> findByCategory(String category);
    List<Book> findByPriceBetween(Double priceStart, Double priceEnd);

}
