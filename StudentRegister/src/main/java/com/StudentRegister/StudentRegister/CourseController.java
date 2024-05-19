package com.StudentRegister.StudentRegister;

import Model.Course;
import Model.Dto.CourseDto;
import impl.Services.CourseService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseController implements CourseService {
    CourseService courseService;

    @Override
    public Mono<CourseDto> findCourseByCourseId(String courseId) {
        return courseService.findCourseByCourseId(courseId);
    }

    @Override
    public Mono<Course> createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @Override
    public Mono<Course> updateCourse(Course course) {
        return courseService.updateCourse(course);
    }

    @Override
    public Mono<Void> deleteCourse(String courseId) {
        return courseService.deleteCourse(courseId);
    }

    @Override
    public Flux<Course> findAllCourses() {
        return courseService.findAllCourses();
    }
}
