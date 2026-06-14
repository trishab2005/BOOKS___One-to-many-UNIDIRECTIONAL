package com.example.controller;

import com.example.dto.BookRequestDto;
import com.example.dto.BookResponseDto;
import com.example.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class BookController {

    private final ChatClient chatClient;
    private final BookService bookService;

    // crud

    @PostMapping
    public ResponseEntity<BookResponseDto> saveTheDto(@RequestBody BookRequestDto bookRequestDto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(bookService.saveBook(bookRequestDto));
    }

    @GetMapping
    public List<BookResponseDto> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getBooksById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponseDto> updateBook(@PathVariable Long id, @RequestBody BookRequestDto bookRequestDto) {
        return ResponseEntity.ok(
                bookService.updateBook(id, bookRequestDto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    // ai-integration

    @GetMapping("/review-author")
    public String reviewAuthor(@RequestParam String authorName) {
        return chatClient.prompt()
                .user("Give a short review of author " + authorName)
                .call()
                .content();
    }

    // custom queries

    @GetMapping("/title/{title}")
    public ResponseEntity<BookResponseDto> getBookByTitle(@PathVariable String title) {
        return ResponseEntity.ok(bookService.getBookByTitle(title));
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<BookResponseDto>> getBooksByCategory(@PathVariable String category) {
        return ResponseEntity.ok(bookService.getBooksByCategory(category));
    }

    @GetMapping("/price-range")
    public ResponseEntity<List<BookResponseDto>> getBooksByPriceRange(@RequestParam Double start, @RequestParam Double end) {
        return ResponseEntity.ok(bookService.getBooksByPriceRange(start, end));
    }
}