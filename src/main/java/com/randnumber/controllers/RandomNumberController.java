package com.randnumber.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("randnumber")
public class RandomNumberController {
    private static final int FIRST_ID = 1;
    private static final int HIGHEST_RANDOM_BOUND = 101;

    //a number is in JSON format with it's ID
    private List<Map<String, Integer>> number = new ArrayList<Map<String, Integer>>() {{
        add(new LinkedHashMap<String, Integer>() {{
            put("id", FIRST_ID);
            put("number", new Random().nextInt(HIGHEST_RANDOM_BOUND));}});
    }};

    @GetMapping
    public List<Map<String, Integer>> getNumber() {
        return number;
    }
}