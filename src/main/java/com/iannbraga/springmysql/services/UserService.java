package com.iannbraga.springmysql.services;

import com.iannbraga.springmysql.entity.User;

public interface UserService {
    User save(User user);
    User findById(Long id);
}
