package com.taohansen.infnet_engsoftesca_tp3.schedule.events;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ScheduleCreatedEvent extends BaseEvent<String> {
    private String description;
    private LocalDateTime date;

    public ScheduleCreatedEvent(String id, String description, LocalDateTime date){
        super(id);
        this.description = description;
        this.date = date;
    }
}
