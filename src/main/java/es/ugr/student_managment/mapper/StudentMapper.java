package es.ugr.student_managment.mapper;

import es.ugr.student_managment.dto.StudentDto;
import es.ugr.student_managment.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDto;
    }
}
