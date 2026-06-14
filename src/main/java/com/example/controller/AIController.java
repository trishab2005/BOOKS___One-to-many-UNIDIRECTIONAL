package com.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ai")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class AIController {

    private final ChatClient chatClient;

    @GetMapping("/review/{author}")
    public String review(@PathVariable String author){
        return chatClient.prompt().user("give review of books written by "+ author).call().content();
    }
}
