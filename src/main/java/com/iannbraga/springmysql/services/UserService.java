package com.iannbraga.springmysql.services;

import com.iannbraga.springmysql.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User findById(Long id);
    Iterable<User> listAll();
}
