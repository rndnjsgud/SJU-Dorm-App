package com.example.sjudormbackend.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity @Data
public class FacilityPetitionLetterFeedback {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityPetitionLetterFeedbackId;
    @Column(name = "facility_petition_letter_id")
    private int facilityPetitionLetterId;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "status")
    private boolean status;
}