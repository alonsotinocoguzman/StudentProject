package repository;

import Model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface StudentRepository<S> extends ReactiveMongoRepository<Student, String> {
    Mono<Student> findStudentByStudentId(String studentId);

    Mono<Student> createStudent(Student student);

    Mono<Student> updateStudent(Student student);

    Mono<Void> deleteStudent(String studentId);

    Flux<Student> findAllStudents();
}
