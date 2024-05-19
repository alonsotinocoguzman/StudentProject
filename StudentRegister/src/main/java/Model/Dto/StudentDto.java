package Model.Dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentDto {
    private String name;
    private String fatherLastName;
    private String motherLastName;
    private String email;
    private String phone;
    private String address;
}
