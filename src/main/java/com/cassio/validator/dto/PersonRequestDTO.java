package com.cassio.validator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonRequestDTO {

    @Valid
    @NotNull
    @Size(min = 1)
    private List<PersonDTO> persons;

}
