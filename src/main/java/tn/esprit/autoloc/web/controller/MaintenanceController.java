package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.MaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
@RequiredArgsConstructor
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Maintenance getOne(@PathVariable Long id) {
        return maintenanceService.retrieve(id);
    }

    @PostMapping
    public Maintenance create(@RequestBody Maintenance m) {
        return maintenanceService.add(m);
    }

    @PutMapping
    public Maintenance update(@RequestBody Maintenance m) {
        return maintenanceService.modify(m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        maintenanceService.remove(id);
    }
}