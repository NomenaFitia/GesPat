package com.example.GesPat.service;

import com.example.GesPat.dto.PatientDTO;
import com.example.GesPat.model.PatientSaveDTO;

import java.util.List;

public interface PatientService {
    List<PatientDTO> getAllPatient();

    String addPatient(PatientSaveDTO patientSaveDTODTO);
}
