package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements ICrudService<Client, Long> {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client retrieve(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client introuvable : " + id));
    }

    @Override
    public Client add(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client modify(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void remove(Long id) {
        clientRepository.deleteById(id);
    }
}