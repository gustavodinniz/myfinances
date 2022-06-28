package br.com.gustavodiniz.myfinances.repositories;

import br.com.gustavodiniz.myfinances.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
