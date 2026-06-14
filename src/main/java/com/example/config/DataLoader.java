package com.example.config;

import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Book> books = List.of(

                Book.builder()
                        .title("Spring Boot")
                        .price(1200.00)
                        .category("Programming")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("Trisha")
                                        .email("trisha@gmail.com")
                                        .build(),
                                Author.builder()
                                        .authorName("Madhu")
                                        .email("madhu@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Java Complete Reference")
                        .price(1500.00)
                        .category("Programming")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("Herbert Schild")
                                        .email("herbert@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Data Structures and Algorithms")
                        .price(999.00)
                        .category("Computer Science")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("Narasimha Karumanchi")
                                        .email("narasimha@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Clean Code")
                        .price(1800.00)
                        .category("Software Engineering")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("Robert Martin")
                                        .email("unclebob@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Microservices with Spring")
                        .price(1350.00)
                        .category("Programming")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("John Thompson")
                                        .email("john@gmail.com")
                                        .build(),
                                Author.builder()
                                        .authorName("Sarah Lee")
                                        .email("sarah@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Database Design Fundamentals")
                        .price(850.00)
                        .category("Database")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("David Brown")
                                        .email("david@gmail.com")
                                        .build()
                        ))
                        .build(),

                Book.builder()
                        .title("Machine Learning Basics")
                        .price(2100.00)
                        .category("AI")
                        .authors(List.of(
                                Author.builder()
                                        .authorName("Andrew Ng")
                                        .email("andrew@gmail.com")
                                        .build()
                        ))
                        .build()
        );

        bookRepository.saveAll(books);

        System.out.println("Dummy data loaded successfully");
    }
}
