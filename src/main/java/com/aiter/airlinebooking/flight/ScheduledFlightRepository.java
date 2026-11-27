package com.aiter.airlinebooking.flight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduledFlightRepository
        extends JpaRepository<ScheduledFlight, Long> {
}