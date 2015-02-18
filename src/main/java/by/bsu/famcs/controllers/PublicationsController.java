package by.bsu.famcs.controllers;

import by.bsu.famcs.model.parsing.EventsReader;
import by.bsu.famcs.model.parsing.PublicationReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by matvei on 18.02.15.
 */
@Controller
public class PublicationsController {

    @RequestMapping(value = "/publications", method = RequestMethod.GET)
    public String getEventPublications(ModelMap model, @RequestParam("event") String eventName) {
        model.addAttribute("events", EventsReader.getInstance().getEvents());
        model.addAttribute("publications", PublicationReader.getInstance().getPublicationsByEvent(eventName));
        return "publications";
    }

    @RequestMapping(value = "/publication", method = RequestMethod.GET)
    public String getFullPublication(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "publication";
    }
}


