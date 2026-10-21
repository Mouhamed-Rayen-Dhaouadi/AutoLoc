package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReseravationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements ICrudService<Reservation, Long> {

    private final ReseravationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieve(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Réservation introuvable : " + id));
    }

    @Override
    public Reservation add(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation modify(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void remove(Long id) {
        reservationRepository.deleteById(id);
    }
}