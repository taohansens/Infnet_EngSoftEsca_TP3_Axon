package com.taohansen.infnet_engsoftesca_tp3.schedule.events;

import lombok.Data;

@Data
public class BaseEvent <T>{
    private T id;

    public BaseEvent(T id){
        this.id = id;
    }
}
