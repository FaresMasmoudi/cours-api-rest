package com.iit.formations.repository;
import com.iit.formations.entity.TravauxPratiques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravauxPratiquesRepository extends JpaRepository<TravauxPratiques, Long> {
}
