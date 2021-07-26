package com.cassio.validator.config;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
public class ExceptionResponse  implements Serializable {

    private String code;
    private String message;
    private Set<String> details;

}
