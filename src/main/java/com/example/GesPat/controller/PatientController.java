package com.example.GesPat.controller;

import com.example.GesPat.dto.PatientDTO;
import com.example.GesPat.model.PatientSaveDTO;
import com.example.GesPat.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/Patient")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @PostMapping(path = "/save")
    public String savePatient(@RequestBody PatientSaveDTO patientSaveDTO){
        return patientService.addPatient(patientSaveDTO);
    }

    @GetMapping(path = "/getAllPatient")
    public List<PatientDTO> getAllPatient(){
        return patientService.getAllPatient();
    }
}
