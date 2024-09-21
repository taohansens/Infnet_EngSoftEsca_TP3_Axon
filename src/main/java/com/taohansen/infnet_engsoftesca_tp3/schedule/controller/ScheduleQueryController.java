package com.taohansen.infnet_engsoftesca_tp3.schedule.controller;

import com.taohansen.infnet_engsoftesca_tp3.domain.Schedule;
import com.taohansen.infnet_engsoftesca_tp3.schedule.service.ScheduleQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleQueryController {
    private final ScheduleQueryService scheduleQueryService;

    @GetMapping("/{id}/events")
    public List<Object> listEvents(@PathVariable String id) {
        return scheduleQueryService.listEvents(id);
    }

    @GetMapping("/{id}")
    public Schedule getById(@PathVariable String id) {
        return scheduleQueryService.getById(id).orElseThrow();
    }
}
