package com.example.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vistara {

    @GetMapping("/vistara")
    public String getData() {return  "vistara the indian flights be safe" ; }
}
