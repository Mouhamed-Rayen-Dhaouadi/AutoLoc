package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenaceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements ICrudService<Maintenance, Long> {

    private final MaintenaceRepository maintenanceRepository;

    @Override
    public List<Maintenance> retrieveAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance retrieve(Long id) {
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Maintenance introuvable : " + id));
    }

    @Override
    public Maintenance add(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public Maintenance modify(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public void remove(Long id) {
        maintenanceRepository.deleteById(id);
    }
}