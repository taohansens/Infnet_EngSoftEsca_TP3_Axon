package com.taohansen.infnet_engsoftesca_tp3.domain;

import com.taohansen.infnet_engsoftesca_tp3.schedule.commands.CreateScheduleCommand;
import com.taohansen.infnet_engsoftesca_tp3.schedule.events.ScheduleCreatedEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import static org.axonframework.modelling.command.AggregateLifecycle.apply;

import java.time.LocalDateTime;

@Aggregate
@NoArgsConstructor
@Getter @Setter
public class ScheduleAggregate {
    @AggregateIdentifier
    private String id;
    private String description;
    private LocalDateTime date;

    @CommandHandler
    public ScheduleAggregate(CreateScheduleCommand commander){
        apply(new CreateScheduleCommand(commander.getId(), commander.getDescription(), commander.getDate()));
    }

    @EventSourcingHandler
    public void on(ScheduleCreatedEvent event) {
        this.id = event.getId();
        this.description = event.getDescription();
        this.date = event.getDate();
    }
}
