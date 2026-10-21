package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.AgenceService;

import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final AgenceService agenceService;

    @GetMapping
    public List<Agence> getAll() { return agenceService.retrieveAll(); }

    @GetMapping("/{id}")
    public Agence getOne(@PathVariable Long id) { return agenceService.retrieve(id); }

    @PostMapping
    public Agence create(@RequestBody Agence a) { return agenceService.add(a); }

    @PutMapping
    public Agence update(@RequestBody Agence a) { return agenceService.modify(a); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { agenceService.remove(id); }
}