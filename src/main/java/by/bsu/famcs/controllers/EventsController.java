package by.bsu.famcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by matvei on 18.02.15.
 */
@Controller
public class EventsController {
    @RequestMapping(value = {"/events", "/"}, method = RequestMethod.GET)
    public String getEvents(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "events";
    }
}
