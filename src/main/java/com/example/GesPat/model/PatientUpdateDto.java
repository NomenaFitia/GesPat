package com.example.GesPat.model;

import jakarta.persistence.Column;

public class PatientUpdateDto {
    private int id_Patient;
    @Column(name = "nom_Patient", length = 255)
    private String nomPatient;
    @Column(name = "naissance_Patient", length = 10)
    private String naissancePatient;
    @Column(name = "sexe_Patient", length = 1)
    private char sexePatient;

    public PatientUpdateDto(int id_Patient, String nomPatient, String naissancePatient, char sexePatient) {
        this.id_Patient = id_Patient;
        this.nomPatient = nomPatient;
        this.naissancePatient = naissancePatient;
        this.sexePatient = sexePatient;
    }

    public PatientUpdateDto() {
    }

    public int getId_Patient() {
        return id_Patient;
    }

    public void setId_Patient(int id_Patient) {
        this.id_Patient = id_Patient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getNaissancePatient() {
        return naissancePatient;
    }

    public void setNaissancePatient(String naissancePatient) {
        this.naissancePatient = naissancePatient;
    }

    public char getSexePatient() {
        return sexePatient;
    }

    public void setSexePatient(char sexePatient) {
        this.sexePatient = sexePatient;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id_Patient=" + id_Patient +
                ", nomPatient='" + nomPatient + '\'' +
                ", naissancePatient='" + naissancePatient + '\'' +
                ", sexePatient=" + sexePatient +
                '}';
    }
}
