package com.example.pk.controller.gui;

import com.example.pk.model.Doctor;
import com.example.pk.model.Spec;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gui/doctors")
public class DoctorGUIController {
    Doctor doctor = new Doctor("1","GIO", Spec.GIGAPEVT ,
            2 ,"Лечит лицо после двойки" ,
            null , null);
    @RequestMapping("/gui/doctorslox")
    String getDoctors(){
        return "doctors";
    }
    @RequestMapping("/get/lox")
    String getOne(Model model){
        model.addAttribute("doctor" , doctor);
        return "doctors";
    }
}
