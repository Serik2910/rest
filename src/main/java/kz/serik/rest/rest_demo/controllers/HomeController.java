package kz.serik.rest.rest_demo.controllers;

import kz.serik.rest.rest_demo.db.DBmanager;
import kz.serik.rest.rest_demo.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public @ResponseBody Event getEventById (@PathVariable(name = "id", value = "1") Long id){
        Event event = DBmanager.getEventById(id);
        return event;
    }



}
