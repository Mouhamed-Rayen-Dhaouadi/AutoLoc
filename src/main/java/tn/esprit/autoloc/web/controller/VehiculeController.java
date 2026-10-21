package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.VehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor

public class VehiculeController {
    private final VehiculeService vehiculeService;


    @GetMapping
    public List<Vehicule> getAll() {
        return vehiculeService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Vehicule getOne(@PathVariable Long id) {
        return vehiculeService.retrieve(id);
    }

    @PostMapping
    public  Vehicule  create(@RequestBody  Vehicule  v) {
        return vehiculeService.add(v);
    }

    @PutMapping
    public  Vehicule  update(@RequestBody  Vehicule  v)  {
        return vehiculeService.modify(v);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        vehiculeService.remove(id);
    }

}
