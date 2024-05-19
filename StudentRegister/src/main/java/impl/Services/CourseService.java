package impl.Services;

import Model.Course;
import Model.Dto.CourseDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CourseService  {
    Mono<CourseDto> findCourseByCourseId(String courseId);

    Mono<Course> createCourse(Course course);

    Mono<Course> updateCourse(Course course);

    Mono<Void> deleteCourse(String courseId);

    Flux<Course> findAllCourses();
}
