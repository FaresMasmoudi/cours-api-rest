package com.iit.formations.service;

import com.iit.formations.entity.FormationDetail;
import com.iit.formations.entity.TpCorrection;
import com.iit.formations.repository.FormationDetailRepository;
import com.iit.formations.repository.TpCorrectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FormationDetailService {

    private final FormationDetailRepository formationDetailRepository;

    public List<FormationDetail> getAllFormationDetails() {
        return formationDetailRepository.findAll();
    }

    public FormationDetail getFormationDetailById(Long id) {
        return formationDetailRepository.findById(id).orElseThrow(() -> new RuntimeException("Detail Formation Not Found!"));
    }

    public FormationDetail createFormationDetail(FormationDetail formationDetail) {
        return formationDetailRepository.save(formationDetail);
    }
}
