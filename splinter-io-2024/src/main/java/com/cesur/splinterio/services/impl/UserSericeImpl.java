package com.cesur.splinterio.services.impl;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;
import com.cesur.splinterio.repositories.UserRepository;
import com.cesur.splinterio.services.UserService;

import java.util.Optional;

public class UserSericeImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) {
       User user = userRepository.getUserByEmail(email).get();
       UserDTO response = new UserDTO();
       response.setActive(user.isActive());
       response.setEmail(user.getEmail());
       response.setId(user.getId());
       response.setLastConnection(user.getLastConnection());
       response.setName(user.getName());
       response.setRol(user.getRol());
       return response;
    }

    @Override
    public void updateUser(UserDTO user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
      
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void storeUser(UserDTO user) {

        User newUser = new User();

        newUser.setId(user.getId());
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setRol(user.getRol());
        newUser.setActive(user.getActive());
        newUser.setLastConnection(user.getLastConnection());

        userRepository.save(newUser);
    }
}
