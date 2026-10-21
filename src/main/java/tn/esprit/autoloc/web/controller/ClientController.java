package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable Long id) {
        return clientService.retrieve(id);
    }

    @PostMapping
    public Client create(@RequestBody Client c) {
        return clientService.add(c);
    }

    @PutMapping
    public Client update(@RequestBody Client c) {
        return clientService.modify(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.remove(id);
    }
}