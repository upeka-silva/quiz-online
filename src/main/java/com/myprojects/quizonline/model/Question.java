package com.myprojects.quizonline.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String question;
    @NotBlank
    private String subject;
    @NotBlank
    private String questionType;
    @NotBlank
    @ElementCollection             //used to map a collection of basic types or
                                   // embeddable objects as an integral part of an owning entity.
    private List<String>choices;
    @NotBlank
    @ElementCollection
    private List<String>correctAnswers;





}