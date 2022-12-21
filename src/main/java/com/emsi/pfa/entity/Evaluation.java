package com.emsi.pfa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "evaluations")
@Data @AllArgsConstructor @NoArgsConstructor
public class Evaluation
{
    private  Long id;
    private String publicId;
    private int evaluation;
    private String comment;
}
