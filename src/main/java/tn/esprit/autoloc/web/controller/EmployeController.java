package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.EmployeService;

import java.util.List;

@RestController
@RequestMapping("/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @GetMapping
    public List<Employe> getAll() {
        return employeService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Employe getOne(@PathVariable Long id) {
        return employeService.retrieve(id);
    }

    @PostMapping
    public Employe create(@RequestBody Employe e) {
        return employeService.add(e);
    }

    @PutMapping
    public Employe update(@RequestBody Employe e) {
        return employeService.modify(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeService.remove(id);
    }
}