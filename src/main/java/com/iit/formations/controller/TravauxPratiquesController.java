package com.iit.formations.controller;

import com.iit.formations.entity.TravauxPratiques;
import com.iit.formations.service.TravauxPratiquesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@CrossOrigin("*")

public class TravauxPratiquesController {
    private final TravauxPratiquesService travauxPratiquesService;

    @GetMapping(path = "/travauxpratiques/{id}")
    public ResponseEntity<TravauxPratiques> getPost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(travauxPratiquesService.getTravauxPratiquesById(id));
    }

    @PostMapping(path = "/travauxpratiques")
    public ResponseEntity<TravauxPratiques> createTravauxPratiques(@RequestBody TravauxPratiques tp) {
        return new ResponseEntity<>(travauxPratiquesService.createTravauxPratiques(tp), HttpStatus.CREATED);
    }
}
