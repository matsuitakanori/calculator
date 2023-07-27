package com.example.demo.personal_information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@CrossOrigin
@RestController
@RequestMapping("/api/personal_information")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationRepository repository;

    @GetMapping("/all3")
    public List<PersonalInformation> getPersonalInformation(){
        List<PersonalInformation> personalinformation = repository.findAll2();
        return personalinformation;
    }
    
}