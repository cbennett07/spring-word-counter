package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WordCounter {

    public Map<String, Integer> count (String strWords){
        Map <String, Integer> map = new HashMap <> ();

        if (strWords != null) {
            String[] separatedWords = strWords.split(" ");
            for (int i = 0; i < separatedWords.length; i++) {
                if (map.containsKey(separatedWords[i])) {
                    int count = map.get(separatedWords[i]);
                    map.put(separatedWords[i], count + 1);
                } else {
                    map.put(separatedWords[i], 1);
                }
            }
        }
        return map;
    }
}
