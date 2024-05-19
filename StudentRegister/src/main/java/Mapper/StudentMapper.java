package Mapper;

import Model.Dto.StudentDto;
import Model.Student;

public interface StudentMapper {
    StudentDto studentToStudentDto(Student student);
}
