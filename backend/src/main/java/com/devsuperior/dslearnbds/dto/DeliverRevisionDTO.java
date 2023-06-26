package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliverRevisionDTO {

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

}
