package no.hvl.dat250.jpa.tutorial.relationshipexample;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;


    @ManyToOne
    private Family family;

    @Transient
    private String nonsenseField = "";

    @OneToMany
    private List<Job> jobList = new ArrayList<>();
}

