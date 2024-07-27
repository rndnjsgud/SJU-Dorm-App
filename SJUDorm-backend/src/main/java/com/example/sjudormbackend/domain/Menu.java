package com.example.sjudormbackend.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Data
public class Menu {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;
    @Column(name = "date")
    private Date date;
    @Column(name = "launch")
    private String launch;
    @Column(name = "dinner")
    private String dinner;
}
