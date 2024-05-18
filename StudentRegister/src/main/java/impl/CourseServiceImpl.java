package impl;

import Model.Course;
import impl.Services.CourseService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.CourseRepository;

@RequiredArgsConstructor
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public Mono<Course> findCourseByCourseId(String courseId) {
        return courseRepository.findCourseByCourseId(courseId);
    }

    @Override
    public Mono<Course> createCourse(Course course) {
        return courseRepository.createCourse(course);
    }

    @Override
    public Mono<Course> updateCourse(Course course) {
        return courseRepository.updateCourse(course);
    }

    @Override
    public Mono<Void> deleteCourse(String courseId) {
        return courseRepository.deleteCourse(courseId);
    }

    @Override
    public Flux<Course> findAllCourses() {
        return courseRepository.findAllCourses();
    }

}
