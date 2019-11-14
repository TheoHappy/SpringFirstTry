package com.webapp.university;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityWebService {
    StudentRepository sRep = new StudentRepository();
    TeacherRepository tRep = new TeacherRepository();
    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }
    @GetMapping("/students")
    public List<String> studentsList(){
        return sRep.getStudents();
    }
    @GetMapping("/teachers")
    public List<String> teachersList(){
        return tRep.getTeachers();
    }
    @PostMapping("/addStudent/{name}")
    public void addStudent(@PathVariable("name") String name) {
        sRep.addStudent(name);

    }
    @PostMapping("/addTeacher/{name}")
    public void addTeacher(@PathVariable("name") String name) {
        tRep.addTeacher(name);

    }

}
