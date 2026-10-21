package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements ICrudService<Employe, Long> {

    private final EmployeRepository employeRepository;

    @Override
    public List<Employe> retrieveAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe retrieve(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employé introuvable : " + id));
    }

    @Override
    public Employe add(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public Employe modify(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public void remove(Long id) {
        employeRepository.deleteById(id);
    }
}