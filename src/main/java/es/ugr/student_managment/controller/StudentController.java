package es.ugr.student_managment.controller;

import es.ugr.student_managment.dto.StudentDto;
import es.ugr.student_managment.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("students/new")
    public String newStudent(Model model){
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student", studentDto);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudents(@ModelAttribute("student") StudentDto student){
        studentService.createStudent(student);
        return "redirect:/students";
    }
}
