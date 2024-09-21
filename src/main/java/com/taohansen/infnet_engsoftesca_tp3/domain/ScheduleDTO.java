package com.taohansen.infnet_engsoftesca_tp3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class ScheduleDTO {
    @Id
    private String id;
    private String description;
    private Situation situation;
    private LocalDateTime date;
}
