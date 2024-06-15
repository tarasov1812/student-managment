package es.ugr.student_managment.repository;

import es.ugr.student_managment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
