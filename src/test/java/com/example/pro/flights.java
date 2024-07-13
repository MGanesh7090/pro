package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {

    @GetMapping("/flights")
    public String getData() {return  "indigo flights be safe" ; }
}
