package com.example.GesPat.service;

import com.example.GesPat.dto.PatientDTO;
import com.example.GesPat.model.Patient;
import com.example.GesPat.model.PatientSaveDTO;
import com.example.GesPat.patientrepo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public List<PatientDTO> getAllPatient() {
        List<Patient> getPatient = patientRepo.findAll();
        List<PatientDTO> patientDTOList = new ArrayList<>();
        for (Patient p : getPatient){
            PatientDTO patientDTO = new PatientDTO(
                    p.getId_Patient(),
                    p.getNomPatient(),
                    p.getNaissancePatient(),
                    p.getSexePatient()
            );
            patientDTOList.add(patientDTO);
        }
        return patientDTOList;
    }

    @Override
    public String addPatient(PatientSaveDTO patientSaveDTODTO) {
        Patient patient = new Patient(
            PatientSaveDTO.getNomPatient(),
            PatientSaveDTO.getNaissancePatient(),
            PatientSaveDTO.getSexePatient()
            );
        patientRepo.save(patient);
        return patient.getNomPatient();
    }
}
