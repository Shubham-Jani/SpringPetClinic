package jani.petcare.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jani.patecare.data.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({ "/", "", "/index", "/index.html" })
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findall());
        return "owners/index";
    }
}
