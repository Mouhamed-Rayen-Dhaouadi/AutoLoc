package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements ICrudService<Contrat, Long> {

    private final ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieve(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable : " + id));
    }

    @Override
    public Contrat add(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat modify(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void remove(Long id) {
        contratRepository.deleteById(id);
    }
}