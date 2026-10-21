package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.ContratService;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@RequiredArgsConstructor
public class ContratController {

    private final ContratService contratService;

    @GetMapping
    public List<Contrat> getAll() {
        return contratService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Contrat getOne(@PathVariable Long id) {
        return contratService.retrieve(id);
    }

    @PostMapping
    public Contrat create(@RequestBody Contrat c) {
        return contratService.add(c);
    }

    @PutMapping
    public Contrat update(@RequestBody Contrat c) {
        return contratService.modify(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contratService.remove(id);
    }
}