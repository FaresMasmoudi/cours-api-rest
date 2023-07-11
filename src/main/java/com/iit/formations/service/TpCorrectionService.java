package com.iit.formations.service;

import com.iit.formations.entity.Formation;
import com.iit.formations.entity.TpCorrection;
import com.iit.formations.repository.TpCorrectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TpCorrectionService {

    private final TpCorrectionRepository tpCorrectionRepository;

    public List<TpCorrection> getAllTpCorrections() {
        return tpCorrectionRepository.findAll();
    }

    public TpCorrection getTpCorrectionById(Long id) {
        return tpCorrectionRepository.findById(id).orElseThrow(() -> new RuntimeException("Correction Tp Not Found!"));
    }

    public TpCorrection createTpCorrection(TpCorrection tpCorrection) {
        return tpCorrectionRepository.save(tpCorrection);
    }

}
