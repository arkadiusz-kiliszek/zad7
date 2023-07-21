package com.example.zad7.endpoint;

import com.example.zad7.example.NamedPairs;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/api/pairs/{name}")
    public NamedPairs parisByName(@PathVariable("name") String name){
        final NamedPairs namedPairs = new NamedPairs();
        namedPairs.setName(name);
        namedPairs.setPairs(Map.of());
        return namedPairs;
    }
}
