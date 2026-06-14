package com.example.service.impl;

import com.example.config.BookMapper;
import com.example.dto.BookRequestDto;
import com.example.dto.BookResponseDto;
import com.example.entity.Book;
import com.example.exception.BookNotFoundException;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    //crud

    @Override
    public BookResponseDto saveBook(BookRequestDto bookRequestDto) {
        Book saved = bookRepository.save(bookMapper.toEntity(bookRequestDto));
        return bookMapper.toDto(saved);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookResponseDto getBooksById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        return bookMapper.toDto(book);
    }

    @Override
    public BookResponseDto updateBook(Long id, BookRequestDto bookRequestDto) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        book.setTitle(bookRequestDto.getTitle());
        book.setPrice(bookRequestDto.getPrice());
        Book updated = bookRepository.save(book);
        return bookMapper.toDto(updated);
    }

    @Override
    public void deleteBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        bookRepository.delete(book);
    }

    // custom query methods

    @Override
    public BookResponseDto getBookByTitle(String title) {
        Book book = bookRepository.findByTitle(title)
                .orElseThrow(() -> new BookNotFoundException("Book not found with title " + title));
        return bookMapper.toDto(book);
    }

    @Override
    public List<BookResponseDto> getBooksByCategory(String category) {
        return bookRepository.findByCategory(category)
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public List<BookResponseDto> getBooksByPriceRange(Double start, Double end) {
        return bookRepository.findByPriceBetween(start, end)
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }
}