package com.aiter.airlinebooking.flight;

import org.springframework.stereotype.Service;

import com.aiter.airlinebooking.flight.dto.CreateScheduledFlightRequest;

@Service
public class ScheduledFlightService {

    private final ScheduledFlightRepository scheduledFlightRepository;

    public ScheduledFlightService(
            ScheduledFlightRepository scheduledFlightRepository) {
        this.scheduledFlightRepository = scheduledFlightRepository;
    }

    public void createScheduledFlight(
            CreateScheduledFlightRequest request) {

        ScheduledFlight flight = ScheduledFlight.create(
                request.getFlightNumber(),
                request.getOrigin(),
                request.getDestination(),
                request.getDepartureTime(),
                request.getArrivalTime(),
                request.getTotalSeats());

        scheduledFlightRepository.save(flight);
    }

}