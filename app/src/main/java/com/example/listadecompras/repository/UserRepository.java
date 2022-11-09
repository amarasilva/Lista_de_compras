package com.example.listadecompras.repository;

import android.content.Context;

import com.example.listadecompras.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserRepositoryInterface {

    private List<User> users;
    private Context contexto;

    private UserRepository(Context contexto) {
        super();
        this.contexto = contexto;
        users = new ArrayList<>();

    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUsersByName(String name) {
        return null;
    }

    @Override
    public User addUser(String login, String senha) {
        User u = new User(1, login, senha);
        users.add(u);
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }


}