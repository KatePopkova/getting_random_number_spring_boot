package com.randnumber.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RandomNumberGenerator {
    private static final int HIGHEST_RANDOM_BOUND = 101;

    private int id;

    public int generateRandomNumber() {
        ++id;
       return new Random().nextInt(HIGHEST_RANDOM_BOUND);
    }

    public List<Map<String, Integer>> toJsonFormat(int value) {
        //a number is in JSON format with it's ID
        List<Map<String, Integer>> number = new ArrayList<Map<String, Integer>>() {{
            add(new LinkedHashMap<String, Integer>() {{
                put("id", id);
                put("number", value);}});
        }};

        return number;
    }
}