package com.webapp.university;

import org.springframework.web.bind.annotation.*;

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
    public List<Student> studentList() {
        return sRep.getStudents();
    }

    @GetMapping("/teachers")
    public List<Teacher> teachersList() {
        return tRep.getTeachers();
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        sRep.addStudent(student);
    }

    @PostMapping("addTeacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        tRep.addTeacher(teacher);
    }

    @PutMapping("/updateStudent/{firstName}")
    public void updateStudent(@PathVariable("firstName") String firstName, @RequestBody Student student) {
        sRep.delStudent(firstName);
        sRep.addStudent(student);
    }

    @PutMapping("/updateTeacher")
    public void uppdateTeacher(@RequestParam String firstName, @RequestBody Teacher teacher) {
        tRep.delTeacher(firstName);
        tRep.addTeacher(teacher);
    }

    @DeleteMapping("/delStudent")
    public void delStudent(@PathVariable("firstName") String firstName) {
        sRep.delStudent(firstName);
    }

    @DeleteMapping("/delTeacher")
    public void delTeacher(@RequestParam String firstName) {
        tRep.delTeacher(firstName);
    }


}
