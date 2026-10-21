package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaimentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements ICrudService<Paiement, Long> {

    private final PaimentRepository paiementRepository;

    @Override
    public List<Paiement> retrieveAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement retrieve(Long id) {
        return paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement introuvable : " + id));
    }

    @Override
    public Paiement add(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public Paiement modify(Paiement p) {
        return paiementRepository.save(p);
    }

    @Override
    public void remove(Long id) {
        paiementRepository.deleteById(id);
    }
}