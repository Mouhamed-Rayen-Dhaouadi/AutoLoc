package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.PaiementService;

import java.util.List;

@RestController
@RequestMapping("/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final PaiementService paiementService;

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Paiement getOne(@PathVariable Long id) {
        return paiementService.retrieve(id);
    }

    @PostMapping
    public Paiement create(@RequestBody Paiement p) {
        return paiementService.add(p);
    }

    @PutMapping
    public Paiement update(@RequestBody Paiement p) {
        return paiementService.modify(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paiementService.remove(id);
    }
}