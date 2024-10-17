package com.cesur.splinterio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.splinterio.models.dtos.IncienceDTO;
import com.cesur.splinterio.services.IncidenceService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api") //Todas las llamadas deben tener /api al principio
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @PostMapping("/incidence") 
    public ResponseEntity<Void> postMethodName(@RequestBody IncienceDTO entity) {
        
        try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

}
