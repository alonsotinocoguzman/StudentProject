package Mapper.Impl;

import Mapper.StudentMapper;
import Model.Dto.StudentDto;
import Model.Student;

public class StudentMapperImpl implements StudentMapper {
    @Override
    public StudentDto studentToStudentDto(Student student) {
        return StudentDto.builder()
                .name(student.getName())
                .fatherLastName(student.getFatherLastName())
                .motherLastName(student.getMotherLastName())
                .email(student.getEmail())
                .phone(student.getPhone())
                .address(student.getAddress())
                .build();
    }
}
