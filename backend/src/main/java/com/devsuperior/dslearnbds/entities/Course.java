package com.devsuperior.dslearnbds.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();
}
