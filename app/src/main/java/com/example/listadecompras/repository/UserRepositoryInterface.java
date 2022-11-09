package com.example.listadecompras.repository;

import com.example.listadecompras.model.User;

import java.util.List;

public interface UserRepositoryInterface {

    public List<User> getUsers();
    public User getUserById(int id);
    public List<User> getUsersByName(String name);
    public User addUser(String login, String senha);
    public User deleteUser(User user) ;
}
