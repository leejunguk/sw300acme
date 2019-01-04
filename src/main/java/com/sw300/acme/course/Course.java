package com.sw300.acme.course;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private int duration;
    private String description;
    private int maxEnrollment;
    private int minEnrollment;
    private float unitPrice;

    @ManyToMany
    private List<Discipline> disciplineList;

    //TODO 재귀관계를 어떻게 구현할 것인가
}
