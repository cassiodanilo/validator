package com.cassio.validator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class AddressDTO {

    @NotNull
    @Length(min = 3)
    private String streetAddress;

    @NotNull
    private String number;

    private String complement;

}
