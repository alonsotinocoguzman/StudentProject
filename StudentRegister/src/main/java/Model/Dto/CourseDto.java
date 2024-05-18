package Model.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDto {
    private String name;
    private String description;
    private String teacher;
    private String schedule;
    private String classroom;
    private String credits;
    private String quota;
}
