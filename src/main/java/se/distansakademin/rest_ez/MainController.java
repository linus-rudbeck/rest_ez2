package se.distansakademin.rest_ez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// .

@RestController
public class MainController {

    // http://localhost:8080/hello
    // RETRY!!!


    @GetMapping("/")
    public String getHome(){
        return "Hello from my deployed app!";
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello my friend";
    }


    @GetMapping("/goodbye")
    public String getGoodbye(){
        return "Good bye my friend";
    }

    @GetMapping("/test")
    public String getTest(){
        return "OK";
    }

}
