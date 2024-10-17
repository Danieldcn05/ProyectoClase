package com.cesur.splinterio.models;

import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "historical")
@AllArgsConstructor
@Data
public class Historical {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") //
    private User userCreated;

    @Column
    private LocalDateTime createdAt;

    @Column
    @Nullable
    private LocalDateTime endedAt;

    @OneToOne //Preguntar a felipe
    @JoinColumn(name = "incidencia_id") 
    private Incidence incidence;

}
