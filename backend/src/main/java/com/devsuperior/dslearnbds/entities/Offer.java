package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String edition;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "offer")
    private List<Resource> resources = new ArrayList<>();

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "offer")
    private List<Topic> topics = new ArrayList<>();
}
