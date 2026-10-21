package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements ICrudService<Equipement, Long> {

    private final EquipementRepository equipementRepository;

    @Override
    public List<Equipement> retrieveAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement retrieve(Long id) {
        return equipementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Équipement introuvable : " + id));
    }

    @Override
    public Equipement add(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public Equipement modify(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public void remove(Long id) {
        equipementRepository.deleteById(id);
    }
}