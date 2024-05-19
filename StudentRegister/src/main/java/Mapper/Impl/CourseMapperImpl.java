package Mapper.Impl;

import Mapper.CourseMapper;
import Model.Course;
import Model.Dto.CourseDto;


public class CourseMapperImpl implements CourseMapper {
    @Override
    public CourseDto courseToCourseDto(Course course) {
        return CourseDto.builder()
                .name(course.getName())
                .description(course.getDescription())
                .teacher(course.getTeacher())
                .schedule(course.getSchedule())
                .classroom(course.getClassroom())
                .credits(course.getCredits())
                .quota(course.getQuota())
                .build();
    }
}
