package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    private String id;
    private String name;
    private String fatherLastName;
    private String motherLastName;
    private String email;
    private String phone;
    private String address;
    private List<Course> courses;
}
