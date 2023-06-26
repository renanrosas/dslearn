package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.dto.UserDTO;
import com.devsuperior.dslearnbds.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
@RequiredArgsConstructor
public class NotificationResource {

    private final NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationForCurrentUser(Pageable pageable){
        Page<NotificationDTO> page = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}
