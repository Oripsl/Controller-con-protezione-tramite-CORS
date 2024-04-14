package com.example.Ex5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ReverseController {
    @CrossOrigin(origins = "http://signorailimoni.it")
    @GetMapping("/{name}")
    public String getName(@PathVariable("name") String name) {
        return name;
    }

    @PostMapping("/reverse/{name}")
    public String reverseName(@PathVariable("name") String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
