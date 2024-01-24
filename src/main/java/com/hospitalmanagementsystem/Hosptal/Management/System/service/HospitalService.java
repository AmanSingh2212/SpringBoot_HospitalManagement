package com.hospitalmanagementsystem.Hosptal.Management.System.service;

import com.hospitalmanagementsystem.Hosptal.Management.System.models.Hospitals;
import com.hospitalmanagementsystem.Hosptal.Management.System.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HospitalService {

     HospitalRepository hospitalRepository;

     public HospitalService(){
         this.hospitalRepository = new HospitalRepository();
     }


    public List<Hospitals> getAllHospital(){
        return hospitalRepository.getAllHospitals();
    }

    public void registerHospital(Hospitals h){
         h.setHospitalId(UUID.randomUUID());
         hospitalRepository.registerHospital(h);
    }
}
