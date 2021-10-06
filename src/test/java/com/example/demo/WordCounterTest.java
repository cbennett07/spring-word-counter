package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class WordCountTest {
    @Autowired
    MockMvc mvc;

    @Test
    void countReturnsAMapOfWordsAndCountsForEach (){
        //setup
        WordCounter myWC = new WordCounter();
        String expected = "{over=1, A=1, a=1, jumps=1, cow=1, brown=2, fox=1}";


        // execution
        String actual = myWC.count("A brown cow jumps over a brown fox").toString();
        assertEquals(expected, actual);
    }
}

