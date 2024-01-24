package com.hospitalmanagementsystem.Hosptal.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Hospitals {

    UUID hospitalId;
    String name;
    List<Bed> beds;
    List<Doctor> doctor;
    List<Patient> patients;
    Long ContactNo;
    String email;

    public Hospitals(UUID hospitalId, String name, List<Bed> beds, List<Doctor> doctor, List<Patient> patients, Long contactNo, String email) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.beds = new ArrayList<>();
        this.doctor = new ArrayList<>();
        this.patients = new ArrayList<>();
        ContactNo = contactNo;
        this.email = email;
    }

    public UUID getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(UUID hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Long getContactNo() {
        return ContactNo;
    }

    public void setContactNo(Long contactNo) {
        ContactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hospitals{" +
                "hospitalId=" + hospitalId +
                ", name='" + name + '\'' +
                ", beds=" + beds +
                ", doctor=" + doctor +
                ", patients=" + patients +
                ", ContactNo=" + ContactNo +
                ", email='" + email + '\'' +
                '}';
    }
}
