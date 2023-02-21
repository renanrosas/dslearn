package com.devsuperior.dslearnbds.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OAuthCustomError {

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;
}
