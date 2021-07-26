package com.cassio.validator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonDTO {

    @NotNull
    @Length(min = 3)
    private String name;

    @NotNull
    @Positive
    private Integer age;

    @Valid
    @NotNull
    @Size(min = 1)
    private List<AddressDTO> addresses;

}
