package com.example;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Michał on 27-01-2017.
 */
@RestController
public class MyAwesomeController {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name, @RequestParam(value = "surname", required = false) String surname){
        return "Hello World from Michał to " + name + " " + surname;
    }


    @RequestMapping("/hello2/{name}")
    public String hello2(  @PathVariable("name") String name){
        return "Hello World from Michał to " + name;
    }

    @RequestMapping("/customer")
    public Customer customer(){
        Customer customer = new Customer("Jakub", "Kowalski");
        return customer;
    }


    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public void message(@RequestBody String message){
        System.out.println("podana wiadomość to: " + message);
    }
}
