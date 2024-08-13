package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRolesList();

    void save(Role role);

    Role findById(Long id);

    Role findByName(String roleName);
}