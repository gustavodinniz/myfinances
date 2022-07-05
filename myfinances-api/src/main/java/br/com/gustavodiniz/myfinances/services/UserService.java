package br.com.gustavodiniz.myfinances.services;

import br.com.gustavodiniz.myfinances.models.UserModel;

public interface UserService {
    UserModel authenticate (String email, String password);

    UserModel saveUser(UserModel userModel);

    void validateEmail(String email);
}
