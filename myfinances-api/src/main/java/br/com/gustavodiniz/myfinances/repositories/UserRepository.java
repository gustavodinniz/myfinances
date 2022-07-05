package br.com.gustavodiniz.myfinances.repositories;

import br.com.gustavodiniz.myfinances.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    boolean existsByEmail(String email);
}
