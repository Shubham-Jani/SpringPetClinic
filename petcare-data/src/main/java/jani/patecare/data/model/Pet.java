package jani.patecare.data.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate localDate;
}
