package com.taohansen.infnet_engsoftesca_tp3.schedule.repository;

import com.taohansen.infnet_engsoftesca_tp3.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, String> {
}
