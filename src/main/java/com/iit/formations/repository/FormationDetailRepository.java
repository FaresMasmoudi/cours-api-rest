package com.iit.formations.repository;


import com.iit.formations.entity.FormationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationDetailRepository extends JpaRepository<FormationDetail, Long> {
}
