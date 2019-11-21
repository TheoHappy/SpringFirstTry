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

/*    @PostMapping("/addStudent/{firstName}/{lastName}/{avg}")
    public void addStudent(@PathVariable String firstName,@PathVariable String lastName,@PathVariable double avg) {
        sRep.addStudent(firstName,lastName,avg);

    }
    @PostMapping("/addstudent")
    public void addStudent(@RequestParam String fName, @RequestParam String lastName, @RequestParam double avg)  {
        sRep.addStudent(fName,lastName,avg);
    }
*/

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        sRep.addStudent(student);
    }

    @PostMapping("addTeacher")
    public void addTeacher(@RequestBody Teacher teacher){
        tRep.addTeacher(teacher);
    }

    @PutMapping("/updateStudent/{firstName}")
    public void updateStudent(@PathVariable("firstName") String firstName, @RequestBody Student student) {
        sRep.delStudent(firstName);
        sRep.addStudent(student);
    }

    @PutMapping("/updateTeacher")
    public void  uppdateTeacher(@RequestParam String firstName, @RequestBody Teacher teacher){
        tRep.delTeacher(firstName);
        tRep.addTeacher(teacher);
    }

    @DeleteMapping("/delStudent")
    public void delStudent(@PathVariable("firstName") String firstName) {
        sRep.delStudent(firstName);
    }
    @DeleteMapping("/delTeacher")
    public void delTeacher(@RequestParam String firstName){
        tRep.delTeacher(firstName);
    }

//    @PutMapping("/addTeacher/{name}")
//    public void addTeacher(@PathVariable("name") String name) {
//        tRep.addTeacher(name);
//
//    }
//    @PutMapping("/addTeacher/{name}")
//    public void addTeacher(@RequestParam(name="name") String name){
//        tRep.addTeacher(name);
//
//    }

//    @DeleteMapping("delTeacher/{name}")
//    public void delTeacher(@PathVariable("name") String name) {
//        tRep.delTeacher(name);
//    }


}
