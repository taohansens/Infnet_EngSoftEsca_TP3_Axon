package com.taohansen.infnet_engsoftesca_tp3.schedule.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class BaseCommand <T> {
    @TargetAggregateIdentifier
    private T id;

    public BaseCommand(T id){
        this.id =id;
    }
}
