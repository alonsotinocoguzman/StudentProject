package Mapper;

import Model.Course;
import Model.Dto.CourseDto;

public interface CourseMapper {
    CourseDto courseToCourseDto(Course course);
}
