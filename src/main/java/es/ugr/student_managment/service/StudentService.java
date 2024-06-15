package es.ugr.student_managment.service;

import es.ugr.student_managment.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudent();
}
