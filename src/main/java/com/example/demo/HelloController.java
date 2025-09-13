package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * This method handles GET requests to the /hello endpoint.
     * It accepts an optional 'name' parameter from the URL.
     * Example: http://localhost:8080/hello?name=World
     * @param name The value of the 'name' query parameter. Defaults to "Guest".
     * @return A greeting string.
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return String.format("Hello, %s!", name);
    }
}
