package com.emsi.pfa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "evaluations")
@Data @AllArgsConstructor @NoArgsConstructor
public class Evaluation
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String publicId;
    private int evaluation;
    private String comment;

    private String driverPublicId;
    private String passengerPublicId;
}
