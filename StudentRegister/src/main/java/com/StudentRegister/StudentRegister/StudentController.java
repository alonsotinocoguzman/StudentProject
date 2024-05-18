package com.StudentRegister.StudentRegister;

import Model.Student;
import impl.Services.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentController implements StudentService {
    StudentService studentService;


    @Override
    public Mono<Student> findStudentByStudentId(String studentId) {
        return studentService.findStudentByStudentId(studentId);
    }

    @Override
    public Mono<Student> createStudent(Student student) {
        return studentService.createStudent(student);
    }

    @Override
    public Mono<Student> updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @Override
    public Mono<Void> deleteStudent(String studentId) {
        return studentService.deleteStudent(studentId);
    }

    @Override
    public Flux<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
