package br.com.gustavodiniz.myfinances.repositories;

import br.com.gustavodiniz.myfinances.models.ReleaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<ReleaseModel, Long> {
}
