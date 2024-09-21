package com.taohansen.infnet_engsoftesca_tp3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Schedule {
    @Id
    private String id;
    private String description;
    private Situation situation;
    private LocalDate date;
}
