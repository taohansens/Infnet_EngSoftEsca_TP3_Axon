package com.taohansen.infnet_engsoftesca_tp3.schedule.service;

import com.taohansen.infnet_engsoftesca_tp3.domain.Schedule;
import com.taohansen.infnet_engsoftesca_tp3.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleQueryService {
    private final EventStore eventStore;
    private final ScheduleRepository scheduleRepository;

    public List<Object> listEvents(String orderId) {
        return eventStore.readEvents(orderId).asStream().collect(Collectors.toList());
    }

    public Optional<Schedule> getById(String id) {
        return scheduleRepository.findById(id);
    }
}
