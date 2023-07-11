package com.iit.formations.controller;

import com.iit.formations.entity.Formation;
import com.iit.formations.service.FormationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@CrossOrigin("*")

public class FormationController {
    private final FormationService formationService;

    @GetMapping(path = "/formations")
    public ResponseEntity<List<Formation>> getFormations() {
        return ResponseEntity.ok().body(formationService.getAllFormations());
    }

    @PostMapping(path = "/formations")
    public ResponseEntity<Formation> createFormation(@RequestBody Formation formation) {
        return new ResponseEntity<>(formationService.createFormation(formation), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/formations/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        formationService.deleteFormation(id);
        return ResponseEntity.ok("User Deleted");
    }

}
