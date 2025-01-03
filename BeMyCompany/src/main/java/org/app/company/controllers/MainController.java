package org.app.company.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = {"/home" , "", "/"})
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/about", "/about/"})
    public String getAboutPage() {
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/contact", "/contact/"})
    public String getContactPage() {
        return "contact";
    }
}