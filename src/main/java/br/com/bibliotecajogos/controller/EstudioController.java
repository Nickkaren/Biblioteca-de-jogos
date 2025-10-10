package br.com.bibliotecajogos.controller;

import br.com.bibliotecajogos.repository.EstudioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.com.bibliotecajogos.entity.Estudio;

@Controller
@RequestMapping("/estudios")
public class EstudioController {

    private final EstudioRepository estudioRepository;

    public EstudioController(EstudioRepository estudioRepository) {
        this.estudioRepository = estudioRepository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("estudios", estudioRepository.findAll());
        return "estudio/listar"; // template: estudio/listar.html
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("estudio", new Estudio());
        return "estudio/form"; // template: estudio/form.html
    }

    @PostMapping
    public String salvar(@ModelAttribute("estudio") Estudio estudio) {
        estudioRepository.save(estudio);
        return "redirect:/estudios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Estudio estudio = estudioRepository.findById(id).orElseThrow();
        model.addAttribute("estudio", estudio);
        return "estudio/form";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        estudioRepository.deleteById(id);
        return "redirect:/estudios";
    }
}
