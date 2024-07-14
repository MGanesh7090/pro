package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USAairlines {

    @GetMapping("/USAairlines")
    public String getData() {return "United states airways" ; }
}
