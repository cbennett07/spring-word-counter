package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PagesController {

    //inject the WordCounter class
    public WordCounter myWC;

    public PagesController(WordCounter myWC){
        this.myWC = myWC;
    }//

    // WORD COUNTER endpoint //
    @PostMapping("/words/count")
    public Map<String, Integer> wordsCounter(@RequestBody String strWords){
        return myWC.count(strWords);
    }//

}
