package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.Notification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {

    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    private Long userId;

    public NotificationDTO(Notification entity){
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }
}
