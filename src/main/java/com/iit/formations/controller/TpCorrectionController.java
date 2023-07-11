package com.iit.formations.controller;

import com.iit.formations.entity.TpCorrection;
import com.iit.formations.service.TpCorrectionService;
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

public class TpCorrectionController {

    private final TpCorrectionService tpCorrectionService;

    @GetMapping(path = "/corrections")
    public ResponseEntity<List<TpCorrection>> getTpCorrections() {
        return ResponseEntity.ok().body(tpCorrectionService.getAllTpCorrections());
    }

    @PostMapping(path = "/corrections")
    public ResponseEntity<TpCorrection> createTpCorrection(@RequestBody TpCorrection tpCorr) {
        return new ResponseEntity<>(tpCorrectionService.createTpCorrection(tpCorr), HttpStatus.CREATED);
    }
}
