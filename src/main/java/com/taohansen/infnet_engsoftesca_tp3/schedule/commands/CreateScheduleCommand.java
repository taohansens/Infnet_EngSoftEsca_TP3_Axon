package com.taohansen.infnet_engsoftesca_tp3.schedule.commands;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
public class CreateScheduleCommand extends BaseCommand<String> {
    private String description;
    private LocalDateTime date;

    public CreateScheduleCommand(String id, String description, LocalDateTime date){
        super(id);
        this.description = description;
        this.date = date;
    }
}
