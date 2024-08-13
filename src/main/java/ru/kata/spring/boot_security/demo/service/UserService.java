package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsersList();

    User getUser(Long id);

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    User findByEmail(String email);

    Optional<Role> getRoleById(Long id);

    List<Role> findAllRoles();

    void setRolesToUser(User user, Long[] roles);
}
