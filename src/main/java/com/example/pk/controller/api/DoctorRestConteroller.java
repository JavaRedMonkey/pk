package com.example.pk.controller.api;

import com.example.pk.model.Doctor;
import com.example.pk.model.Spec;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctors")
public class DoctorRestConteroller<doctor> {
    Doctor doctor = new Doctor("1","GIO", Spec.GIGAPEVT ,
            2 ,"Лечит лицо после двойки" ,
            null , null);
    @RequestMapping("/hello")
    String sayHello(){
        return "<h1>Ти Лох<h1>" +
                "<img src=\\>";
    }
    @RequestMapping("/get/one")
    Doctor getOne(){
        return doctor;
    }
}
