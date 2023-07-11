package com.iit.formations.controller;

import com.iit.formations.entity.Formation;
import com.iit.formations.entity.FormationDetail;
import com.iit.formations.entity.TpCorrection;
import com.iit.formations.entity.TravauxPratiques;
import com.iit.formations.service.FormationDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FormationDetailController {

    private final FormationDetailService formationDetailService;

    @GetMapping(path = "/details")
    public ResponseEntity<List<FormationDetail>> getFormationDetails() {
        return ResponseEntity.ok().body(formationDetailService.getAllFormationDetails());
    }
    @GetMapping(path = "/details/{id}")
    public ResponseEntity<FormationDetail> getPost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(formationDetailService.getFormationDetailById(id));
    }


    @PostMapping(path = "/details")
    public ResponseEntity<FormationDetail> createFormationDetail(@RequestBody FormationDetail detail) {
        return new ResponseEntity<>(formationDetailService.createFormationDetail(detail), HttpStatus.CREATED);
    }
}
