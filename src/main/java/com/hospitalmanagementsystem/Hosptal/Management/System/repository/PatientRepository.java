package com.hospitalmanagementsystem.Hosptal.Management.System.repository;

import com.hospitalmanagementsystem.Hosptal.Management.System.models.Patient;

import java.util.HashMap;
import java.util.UUID;

public class PatientRepository {

     HashMap<UUID, Patient> patientDB;

    public PatientRepository(HashMap<UUID, Patient> patientDB) {
        this.patientDB = new HashMap<>();
    }


}
