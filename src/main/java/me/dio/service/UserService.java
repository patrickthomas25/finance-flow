package me.dio.service;

import me.dio.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User create(User user);
    User update(Long id, User user);
    void delete(Long id);
}
