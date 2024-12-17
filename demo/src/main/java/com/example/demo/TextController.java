package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/text")
public class TextController {

    @Autowired
    private TextProcessor textProcessor;

    @PostMapping("/process")
    public ArrayList<String> processText(@RequestBody ArrayList<String> inputLines) {
        return textProcessor.processText(inputLines);
    }
}
