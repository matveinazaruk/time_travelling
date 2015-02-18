package by.bsu.famcs.controllers;

import by.bsu.famcs.model.parsing.EventsReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventsController {
    @RequestMapping(value = {"/events", "/"}, method = RequestMethod.GET)
    public String getEvents(ModelMap model) {
        model.addAttribute("events", EventsReader.getInstance().getEvents());
        return "events";
    }
}
