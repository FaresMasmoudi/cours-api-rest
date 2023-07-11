package com.iit.formations.service;

import com.iit.formations.entity.TpCorrection;
import com.iit.formations.entity.TravauxPratiques;
import com.iit.formations.repository.TravauxPratiquesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TravauxPratiquesService {
    private final TravauxPratiquesRepository travauxPratiquesRepository;

    public TravauxPratiques getTravauxPratiquesById(Long id) {
        return travauxPratiquesRepository.findById(id).orElseThrow(() -> new RuntimeException("Tp Not Found!"));
    }
    public List<TravauxPratiques> getAllTravauxPratiques() {
        return travauxPratiquesRepository.findAll();
    }

    public TravauxPratiques createTravauxPratiques(TravauxPratiques tp) {
        return travauxPratiquesRepository.save(tp);
    }
}
