# Architecture

## V0 Goal

Build the airline booking backend first as a modular monolith, then evolve it only where distributed components solve a real problem.

## Core Domains

- Flight
- Booking
- Payment
- User

## Initial Flow

1. Search available flights
2. Select and reserve a seat
3. Create a booking
4. Process simulated payment
5. Confirm the booking
6. Cancel and release the seat when necessary

## Architecture Direction

- Spring Boot REST API
- PostgreSQL persistence
- Transactional booking and seat inventory
- Domain-oriented package structure
- Redis, messaging, and distributed components added later when justified
