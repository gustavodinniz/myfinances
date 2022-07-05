package br.com.gustavodiniz.myfinances.repositories;

import br.com.gustavodiniz.myfinances.models.UserModel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void whenVerifyTheExistenceOfAnEmail() {

        UserModel userTest = UserModel.builder()
                .name("UserTest")
                .email("usertest@email.com")
                .build();

        userRepository.save(userTest);

        boolean result = userRepository.existsByEmail("usertest@email.com");

        Assertions.assertThat(result).isTrue();
    }


    @Test
    public void shouldReturnFalseWhenThereIsNotRegisteredUserWithEmail() {

    }
}