package gr.hua.dit.dsproject.controllers;

import gr.hua.dit.dsproject.entities.Student;
import gr.hua.dit.dsproject.repositories.StudentRepository;
import gr.hua.dit.dsproject.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {
    private final StudentService studentService;
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping("")
//    public List<Student> getAll(){
//        return studentRepository.findAll();
//    }

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.save(student);
        return ResponseEntity.ok(savedStudent);
    }


}
