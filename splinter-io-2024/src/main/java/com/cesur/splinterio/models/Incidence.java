package com.cesur.splinterio.models;

import java.time.LocalDateTime;

import com.cesur.splinterio.models.utils.enums.Priorities;
import com.cesur.splinterio.models.utils.enums.Scopes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidence")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

    @Column
    private String description;


    @Column
    @Enumerated(EnumType.STRING)
    private Priorities priority;

    @Column
    @Enumerated(EnumType.STRING)
    private Scopes scope;


    @Column
    private LocalDateTime createdAt;

    @Column(nullable = true)
    private LocalDateTime updateAt;

    @Column(nullable = true)
    private LocalDateTime deletedAt;


    @ManyToOne //Muchas incidencias hacia un usuario
    @JoinColumn(name = "user_id") // 
    private User userCreated;

    
}