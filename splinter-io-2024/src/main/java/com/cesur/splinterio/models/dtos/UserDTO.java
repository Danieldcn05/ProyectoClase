package com.cesur.splinterio.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.cesur.splinterio.models.utils.enums.Roles; 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
}