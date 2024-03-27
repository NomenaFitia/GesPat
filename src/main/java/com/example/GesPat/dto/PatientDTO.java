package com.example.GesPat.dto;

public class PatientDTO {
    private int id_Patient;
    private String nomPatient;
    private String naissancePatient;
    private char sexePatient;

    public PatientDTO(int id_Patient, String nomPatient, String naissancePatient, char sexePatient) {
        this.id_Patient = id_Patient;
        this.nomPatient = nomPatient;
        this.naissancePatient = naissancePatient;
        this.sexePatient = sexePatient;
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
        return "PatientDTO{" +
                "id_Patient=" + id_Patient +
                ", nomPatient='" + nomPatient + '\'' +
                ", naissancePatient='" + naissancePatient + '\'' +
                ", sexePatient=" + sexePatient +
                '}';
    }
}
