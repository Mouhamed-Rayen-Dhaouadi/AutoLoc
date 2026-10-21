package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceService implements ICrudService<Agence, Long> {

    private final AgenceRepository agenceRepository;

    @Override
    public List<Agence> retrieveAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence retrieve(Long id) {
        return agenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence introuvable : " + id));
    }

    @Override
    public Agence add(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public Agence modify(Agence a) {
        return agenceRepository.save(a);
    }

    @Override
    public void remove(Long id) {
        agenceRepository.deleteById(id);
    }
}