package br.com.gustavodiniz.myfinances.services.impl;

import br.com.gustavodiniz.myfinances.exceptions.BusinessRuleException;
import br.com.gustavodiniz.myfinances.models.UserModel;
import br.com.gustavodiniz.myfinances.repositories.UserRepository;
import br.com.gustavodiniz.myfinances.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel authenticate(String email, String password) {
        return null;
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        return null;
    }

    @Override
    public void validateEmail(String email) {
        var existsByEmail = userRepository.existsByEmail(email);
        if (existsByEmail) {
            throw new BusinessRuleException("There is already a registered user with this email.");
        }
    }
}
