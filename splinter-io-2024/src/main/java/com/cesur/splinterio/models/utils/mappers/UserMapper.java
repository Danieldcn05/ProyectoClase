package com.cesur.splinterio.models.utils.mappers;

import org.springframework.cglib.core.Local;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;

import java.time.LocalDateTime;

public class UserMapper {
    public static UserDTO userToDTO(User user){
        UserDTO response = new UserDTO();
        if (user != null){
            response.setActive(user.isActive());
            response.setEmail(user.getEmail());
            response.setId(user.getId());
            response.setLastConnection(user.getLastConnection());
            response.setName(user.getName());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());
        }

        return response;
    }

    public static User dtoToUserCreated(UserDTO user){
        User response = new User();
        if (user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());
            response.setActive(user.getActive());


            response.setCreatedAt(LocalDateTime.now());
            
        }
        return response;
    }
    public static User dtoToUserUpdated(UserDTO user){
        User response = new User();
        if (user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());
            response.setActive(user.getActive());


            
            
        }
        return response;
    }
}
