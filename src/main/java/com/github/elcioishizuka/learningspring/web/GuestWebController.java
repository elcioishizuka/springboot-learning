package com.github.elcioishizuka.learningspring.web;

import com.github.elcioishizuka.learningspring.business.service.GuestService;
import com.github.elcioishizuka.learningspring.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestWebController {

    private final GuestService guestService;

    @Autowired
    public GuestWebController(GuestService guestService) {
        this.guestService = guestService;
    }


    @GetMapping
    public String getGuests(Model model){
        Iterable<Guest> guests = this.guestService.findAll();
        model.addAttribute("guests", guests);
        return "guests";
    }


}
