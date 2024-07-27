package com.example.sjudormbackend.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FacilityPetitionLetter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityPetitionLetterId;
    @Column(name = "status")
    private boolean status;
    @Column(name = "room_number")
    private int roomNumber;
    @Column(name = "title")
    private String title;
    @Column(name = "name")
    private String name;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "content")
    private String content;
}