package com.example.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController(){

    }


    @GetMapping("/holamundo")
    public String saludar(){
        return "Hola mundo soy Manuel";
    }

}
