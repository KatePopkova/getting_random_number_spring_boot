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

    public Map<String, Integer> toJsonFormat(int value) {
        //a number is in JSON format with it's ID
        Map<String , Integer> number = new LinkedHashMap<String, Integer>();
        number.put("id", id);
        number.put("number", value);
        return number;
    }
}