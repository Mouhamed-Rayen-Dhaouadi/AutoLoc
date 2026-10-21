package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements ICrudService<Vehicule, Long> {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public List<Vehicule> retrieveAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule retrieve(Long id) {
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable : " + id));
    }

    @Override
    public Vehicule add(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule modify(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public void remove(Long id) {
        vehiculeRepository.deleteById(id);
    }
}