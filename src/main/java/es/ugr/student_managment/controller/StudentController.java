package es.ugr.student_managment.controller;

import es.ugr.student_managment.dto.StudentDto;
import es.ugr.student_managment.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDto> students = studentService.getAllStudent();
        model.addAttribute("students", students);
        return "students";
    }
}
