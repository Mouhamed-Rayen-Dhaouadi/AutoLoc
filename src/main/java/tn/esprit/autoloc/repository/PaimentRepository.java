package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.Paiement;

public interface PaimentRepository extends JpaRepository<Paiement,Long> {
}
