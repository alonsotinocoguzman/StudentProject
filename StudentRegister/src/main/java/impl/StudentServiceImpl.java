package impl;

import Model.Student;
import impl.Services.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.StudentRepository;

@RequiredArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public Mono<Student> findStudentByStudentId(String studentId) {
        return studentRepository.findStudentByStudentId(studentId);
    }

    @Override
    public Mono<Student> createStudent(Student student) {
        return studentRepository.createStudent(student);
    }

    @Override
    public Mono<Student> updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Mono<Void> deleteStudent(String studentId) {
        return studentRepository.deleteStudent(studentId);
    }

    @Override
    public Flux<Student> findAllStudents() {
        return studentRepository.findAllStudents();
    }
    }
