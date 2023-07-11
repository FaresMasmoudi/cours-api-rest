package com.iit.formations.repository;
import com.iit.formations.entity.TpCorrection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TpCorrectionRepository extends JpaRepository<TpCorrection, Long> {
}
