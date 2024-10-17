package com.cesur.splinterio.models;

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
@Table(name = "chat")
@AllArgsConstructor
@Data
public class AttachedFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255)
    private String name;

    @Column(length = 150)
    private String mimeType;

    @Column(length = 150)
    private String route;

    @ManyToOne 
    @JoinColumn(name = "incidencia_id") 
    private Incidence incidence;
}
