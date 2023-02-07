package com.iannbraga.springmysql.services;

import com.iannbraga.springmysql.entity.User;
import com.iannbraga.springmysql.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public User save(User user){
        user.setActive(true);
        return userRepository.save(user);
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }
}
