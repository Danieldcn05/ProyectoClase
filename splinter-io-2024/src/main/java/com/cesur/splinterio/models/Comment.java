package com.cesur.splinterio.models;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "comment")
@AllArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String content;

    @Column
    private LocalDateTime createdAt;

    @ManyToOne //Muchas comentarios hacia un usuario
    @JoinColumn(name = "user_id") // 
    private User userCreated;

    @ManyToOne // Muchos comentarios hacia una incidencia
    @JoinColumn(name = "incidencia_id") 
    private Incidence incidence;
}
