package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class britishair {

    @GetMapping("/britishair")
    public String getData() {return  "The great british airways" ; }
}
