package com.example.dto;

import com.example.entity.Author;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponseDto {

    private Long bookId;
    private String title;
    private Double price;
    private String category;

    private List<Author> authors;
}