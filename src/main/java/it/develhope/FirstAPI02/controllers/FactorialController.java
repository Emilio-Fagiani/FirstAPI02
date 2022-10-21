package it.develhope.FirstAPI02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController (value = "/factorial")
@RequestMapping
public class FactorialController {

    @GetMapping
    public int getFactorial(@PathVariable (required = true) int n){
        int factorial = 1;
        if ( n == 0){
            return 1;
        }
        for (int i = 0; i < n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }


}
