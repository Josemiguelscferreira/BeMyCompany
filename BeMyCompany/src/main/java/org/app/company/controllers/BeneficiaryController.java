package org.app.company.controllers;

import org.app.company.model.Beneficiary;
import org.app.company.services.BeneficiaryService;
import org.app.company.services.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeneficiaryController {

    @Autowired
    private VolunteerService volunteerService;

    @Autowired
    private BeneficiaryService beneficiaryService;
    @RequestMapping(method = RequestMethod.GET, path = {"/beneficiaryLogin", "/beneficiaryLogin/"})
    public String getLoginPage() {
        return "beneficiaryLogin";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/beneficiaryRegister", "/beneficiaryRegister/"})
    public String getRegister() {
        return "beneficiaryRegister";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/beneficiaryRegister", "beneficiaryRegister/"})
    public String addBeneficiary(@RequestBody Beneficiary beneficiary) {
        beneficiaryService.addBeneficiary(beneficiary);
        return "beneficiaryProfile";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/beneficiaryProfile", "/beneficiaryProfile/"})
    public String getProfile() {
        return "beneficiaryProfile";
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/beneficiaryProfile", "/beneficiaryProfile/"})
    public String getProfileGet(Model model) {
         model.addAttribute("beneficiary", beneficiaryService.getBeneficiary());
        return "beneficiaryProfile";
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/beneficiarySchedule", "/beneficiarySchedule/"})
    public String getSchedulePage() {
        return "beneficiarySchedule";
    }
    @RequestMapping(method = RequestMethod.GET, path = {"/benef/home", "/benef/home/"})
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/benef/calendar", "/benef/calendar/"})
    public String getCalendar() {
        return "calendar";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/benef/edit", "/benef/edit/"})
    public String getEdit() {
        return "edit";
    }
}
