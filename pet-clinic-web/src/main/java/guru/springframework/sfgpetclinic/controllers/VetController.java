package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    VetController(VetService vetService)
    {
        this.vetService=vetService;
    }
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listrVets(Model model)
    {
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
