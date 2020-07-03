package com.randnumber.controller;

import com.randnumber.service.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("randnumber")
public class RandomNumberController {

    @Autowired
    private RandomNumberGenerator randomNumberGenerator;

    @GetMapping
    public Map<String, Integer> getNumber() {
        int number = randomNumberGenerator.generateRandomNumber();
        Map<String, Integer> numJsonFormat = randomNumberGenerator.toJsonFormat(number);
        return numJsonFormat;
    }
}