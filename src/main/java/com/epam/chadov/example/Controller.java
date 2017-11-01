package com.epam.chadov.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andrey_Chadov on 11/1/2017.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
