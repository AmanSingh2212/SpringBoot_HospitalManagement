package com.hospitalmanagementsystem.Hosptal.Management.System.controller;

import com.hospitalmanagementsystem.Hosptal.Management.System.models.Hospitals;
import com.hospitalmanagementsystem.Hosptal.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    HospitalService hospitalService = new HospitalService();

    @GetMapping("/getAllHospital")
    public List<Hospitals>  getAllHospitals(){
        return hospitalService.getAllHospital();
    }

    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospitals obj)
    {
        hospitalService.registerHospital(obj);
        return "Hospital Added Successfully";
    }

}
