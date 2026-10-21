package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.retrieveAll();
    }

    @GetMapping("/{id}")
    public Reservation getOne(@PathVariable Long id) {
        return reservationService.retrieve(id);
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation r) {
        return reservationService.add(r);
    }

    @PutMapping
    public Reservation update(@RequestBody Reservation r) {
        return reservationService.modify(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservationService.remove(id);
    }
}