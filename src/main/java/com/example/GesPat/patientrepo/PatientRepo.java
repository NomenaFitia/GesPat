package com.example.GesPat.patientrepo;

import com.example.GesPat.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
}
