package impl.Services;

import Model.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface StudentService {
    Mono<Student> findStudentByStudentId(String studentId);

    Mono<Student> createStudent(Student student);

    Mono<Student> updateStudent(Student student);

    Mono<Void> deleteStudent(String studentId);

    Flux<Student> findAllStudents();
}
