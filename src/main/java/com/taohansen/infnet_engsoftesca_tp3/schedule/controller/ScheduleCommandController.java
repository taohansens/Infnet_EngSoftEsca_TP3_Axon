package com.taohansen.infnet_engsoftesca_tp3.schedule.controller;

import com.taohansen.infnet_engsoftesca_tp3.domain.ScheduleDTO;
import com.taohansen.infnet_engsoftesca_tp3.schedule.service.ScheduleCommandService;
import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/schedule")
@AllArgsConstructor
public class ScheduleCommandController {
    private final CommandGateway commandGateway;
    private final ScheduleCommandService scheduleCommandService;

    @PostMapping
    public ResponseEntity<String> createSchedule(@RequestBody ScheduleDTO scheduleDTO) {
        String scheduleId = UUID.randomUUID().toString();
        scheduleCommandService.createSchedule(
                scheduleId,
                scheduleDTO.getDescription(),
                scheduleDTO.getDate()
        );

        return ResponseEntity.status(201).body(scheduleId);
    }
}
