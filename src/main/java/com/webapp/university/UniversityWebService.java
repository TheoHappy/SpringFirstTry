package com.webapp.university;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversityWebService {
    @RequestMapping
    public String test() {
        return "First try in Spring Web";
    }
    @RequestMapping("/students")
    public List<String> studentsList(){
        return List.of("Andrei","Alexandrina","Dumitru","Andrei","Zina");
    }
    @RequestMapping("/teachers")
    public List<String> teachersList(){
        return List.of("Vadim","Anatolie","Silvia","Ana","Petrea");
    }

}
