package com.example.service;

import com.example.dto.BookRequestDto;
import com.example.dto.BookResponseDto;

import java.util.List;

public interface BookService {

    //crud

    BookResponseDto saveBook(BookRequestDto bookRequestDto);
    List<BookResponseDto> getAllBooks();
    BookResponseDto getBooksById(Long id);
    BookResponseDto updateBook(Long id, BookRequestDto bookRequestDto);
    void deleteBookById(Long id);

    // custom queries
    BookResponseDto getBookByTitle(String title);
    List<BookResponseDto> getBooksByCategory(String category);
    List<BookResponseDto> getBooksByPriceRange(Double start, Double end);
}
