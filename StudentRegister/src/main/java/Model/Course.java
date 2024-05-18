package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Course {
    private String id;
    private String name;
    private String description;
    private String teacher;
    private String schedule;
    private String classroom;
    private String credits;
    private String quota;
    private List<Student> students;
}
