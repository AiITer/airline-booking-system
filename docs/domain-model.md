# Initial Domain Model

## Flight
Represents a scheduled flight.

Key concepts:
- Flight number
- Origin
- Destination
- Departure time
- Arrival time
- Aircraft
- Seat availability

## Booking
Represents a user's reservation.

Key concepts:
- Booking ID
- User
- Flight
- Selected seat
- Booking status
- Created time

## Payment
Represents the simulated payment for a booking.

Key concepts:
- Payment ID
- Booking ID
- Amount
- Payment status

## User
Represents a customer using the booking system.

Key concepts:
- User ID
- Name
- Email

## Initial Relationships

- One Flight has many Bookings
- One User can have many Bookings
- One Booking belongs to one Flight
- One Booking has one Payment
