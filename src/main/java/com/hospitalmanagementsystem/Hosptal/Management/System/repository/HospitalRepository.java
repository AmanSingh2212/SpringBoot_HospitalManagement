package com.hospitalmanagementsystem.Hosptal.Management.System.repository;


import com.hospitalmanagementsystem.Hosptal.Management.System.models.Hospitals;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class HospitalRepository {
    //    Id vs Hospital object
    HashMap<UUID, Hospitals> hospitalDb;

    public HospitalRepository() {
        this.hospitalDb = new HashMap<>();
    }

    public List<Hospitals> getAllHospitals()
    {
        List<Hospitals> hospitals = new ArrayList<>();
        for (UUID id : hospitalDb.keySet()) {
            Hospitals h = hospitalDb.get(id);
            hospitals.add(h);
        }
        return hospitals;
    }

    public void registerHospital(Hospitals h)
    {
        UUID id = h.getHospitalId();
        hospitalDb.put(id, h);
    }
}

