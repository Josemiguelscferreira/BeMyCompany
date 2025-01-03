package org.app.company.controllers;

import org.app.company.model.Volunteer;
import org.app.company.services.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VolunteerController {
    @Autowired
    private VolunteerService volunteerService;

    @RequestMapping(method = RequestMethod.GET, path = {"/volunteerLogin", "volunteerLogin/"})
    public String getLoginPage() {
        return "volunteerLogin";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/volunteerRegister", "/volunteerRegister/"})
    public String getRegister() {
        return "volunteerRegister";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/volunteerRegister", "volunteerRegister/"})
    public String addVolunteer(@RequestBody Volunteer volunteer) {
        volunteerService.addVolunteer(volunteer);
        return "redirect:/volunteerProfile";
    }
    @RequestMapping(method = RequestMethod.POST, path = {"/volunteerProfile", "/volunteerProfile/"})
    public String getProfile() {
        return "volunteerProfile";
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/volunteerProfile", "/volunteerProfile/"})
    public String getProfileGet() {
        return "volunteerProfile";
    }

}
