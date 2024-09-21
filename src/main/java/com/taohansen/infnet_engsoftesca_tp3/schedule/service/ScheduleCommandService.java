package com.taohansen.infnet_engsoftesca_tp3.schedule.service;

import com.taohansen.infnet_engsoftesca_tp3.schedule.commands.CreateScheduleCommand;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ScheduleCommandService {
    private final CommandGateway commandGateway;

    public void createSchedule(String id, String description, LocalDateTime date){
        CreateScheduleCommand command = new CreateScheduleCommand(id, description, date);
        commandGateway.send(command);
    }
}
