package com.iit.formations.service;

import com.iit.formations.entity.Formation;
import com.iit.formations.repository.FormationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormationService {

    private final FormationRepository formationRepository;

    public List<Formation> getAllFormations() {
        return formationRepository.findAll();
    }

    public Formation getFormationById(Long id) {
        return formationRepository.findById(id).orElseThrow(() -> new RuntimeException("Formation Not Found!"));
    }

    public Formation createFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    public void deleteFormation(Long id) {
        formationRepository.deleteById(id);
    }
}
