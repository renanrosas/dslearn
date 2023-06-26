package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
@RequiredArgsConstructor
public class DeliverResource {

    private final DeliverService service;

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto){
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }
}
