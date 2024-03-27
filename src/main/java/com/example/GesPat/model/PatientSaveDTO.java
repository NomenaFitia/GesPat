package com.example.GesPat.model;

import jakarta.persistence.Column;

public class PatientSaveDTO {
    @Column(name = "nom_Patient")
    private static String nomPatient;
    @Column(name = "naissance_Patient")
    private static String naissancePatient;
    @Column(name = "sexe_Patient")
    private static char sexePatient;

    public PatientSaveDTO(String nomPatient, String naissancePatient, char sexePatient) {
        this.nomPatient = nomPatient;
        this.naissancePatient = naissancePatient;
        this.sexePatient = sexePatient;
    }

    public PatientSaveDTO() {
    }

    public static String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public static String getNaissancePatient() {
        return naissancePatient;
    }

    public void setNaissancePatient(String naissancePatient) {
        this.naissancePatient = naissancePatient;
    }

    public static char getSexePatient() {
        return sexePatient;
    }

    public void setSexePatient(char sexePatient) {
        this.sexePatient = sexePatient;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", nomPatient='" + nomPatient + '\'' +
                ", naissancePatient='" + naissancePatient + '\'' +
                ", sexePatient=" + sexePatient +
                '}';
    }
}
