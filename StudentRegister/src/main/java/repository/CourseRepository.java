package repository;

import Model.Course;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseRepository extends ReactiveMongoRepository<Course, String> {
    Mono<Course> findCourseByCourseId(String courseId);
    Mono<Course> createCourse(Course course);
    Mono<Course> updateCourse(Course course);
    Mono<Void> deleteCourse(String courseId);
    Flux<Course> findAllCourses();
}
