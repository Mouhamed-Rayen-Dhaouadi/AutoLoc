package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.EquipementService;

import java.util.List;

@RestController
@RequestMapping("/equipements")
@RequiredArgsConstructor
public class EquipementController {

    private final EquipementService equipementService;

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Equipement getOne(@PathVariable Long id) {
        return equipementService.retrieve(id);
    }

    @PostMapping
    public Equipement create(@RequestBody Equipement e) {
        return equipementService.add(e);
    }

    @PutMapping
    public Equipement update(@RequestBody Equipement e) {
        return equipementService.modify(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        equipementService.remove(id);
    }
}