package impl;

import Mapper.CourseMapper;
import Model.Course;
import Model.Dto.CourseDto;
import Utils.ApiExceptions;
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
    private CourseMapper courseMapper;

    @Override
    public Mono<CourseDto> findCourseByCourseId(String courseId) {
        return courseRepository.findCourseByCourseId(courseId)
                .switchIfEmpty(Mono.error(ApiExceptions.COURSE_NOT_FOUND.getException()))
                .map(course -> courseMapper.courseToCourseDto(course));
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
