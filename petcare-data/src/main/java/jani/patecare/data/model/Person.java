package jani.patecare.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
