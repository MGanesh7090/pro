package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {

    @GetMapping("/visa")
    public String getData() {return  "Please Book Visa For Dubai at 7000 Rs, Thank you" ; }
}
