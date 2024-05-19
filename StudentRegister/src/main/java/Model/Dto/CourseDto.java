package Model.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CourseDto {

    private String name;
    private String description;
    private String teacher;
    private String schedule;
    private String classroom;
    private String credits;
    private String quota;

}
