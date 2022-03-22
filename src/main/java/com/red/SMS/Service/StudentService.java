package com.red.SMS.Service;

import com.red.SMS.Entity.Student;
import com.red.SMS.Repository.StudentRepository;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
