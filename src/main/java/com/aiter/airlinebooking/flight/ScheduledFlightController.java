package com.aiter.airlinebooking.flight;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiter.airlinebooking.flight.dto.CreateScheduledFlightRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/flights")
public class ScheduledFlightController {

    private final ScheduledFlightService scheduledFlightService;

    public ScheduledFlightController(
            ScheduledFlightService scheduledFlightService) {

        this.scheduledFlightService = scheduledFlightService;
    }

    @PostMapping
    public void createScheduledFlight(
            @Valid @RequestBody CreateScheduledFlightRequest request) {
                scheduledFlightService.createScheduledFlight(request);
    }
}