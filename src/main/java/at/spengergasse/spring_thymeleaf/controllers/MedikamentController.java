package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Medikamente;
import at.spengergasse.spring_thymeleaf.entities.MedikamenteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/medikament")
public class MedikamentController {
    private final MedikamenteRepository medikamenteRepository;

    public MedikamentController(MedikamenteRepository medikamenteRepository) {
        this.medikamenteRepository = medikamenteRepository;
    }

    @GetMapping("/list")
    public String Medikamente(Model model) {
        model.addAttribute("medikamente", medikamenteRepository.findAll());
        return "medlist";
    }

    @GetMapping("/add")
    public String addMedikamente(Model model) {
        model.addAttribute("medikament", new Medikamente());
        return "add_medikament";
    }

    @PostMapping("/add")
    public String addMedikamente(@ModelAttribute("medikament") Medikamente medikament) {
        medikamenteRepository.save(medikament);
        return  "redirect:/medikament/list";
    }

    @PostMapping("/delete/{id}")
    public String deleteMedikament(@PathVariable("id") int medikament) {
        medikamenteRepository.deleteById(medikament);
        return "redirect:/medikament/list";
    }
}
