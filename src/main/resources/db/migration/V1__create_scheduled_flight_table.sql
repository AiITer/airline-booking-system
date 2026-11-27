CREATE TABLE scheduled_flight (
    id BIGINT NOT NULL AUTO_INCREMENT,
    flight_number VARCHAR(20) NOT NULL,
    origin VARCHAR(10) NOT NULL,
    destination VARCHAR(10) NOT NULL,
    departure_time DATETIME NOT NULL,
    arrival_time DATETIME NOT NULL,
    total_seats INT NOT NULL,
    available_seats INT NOT NULL,

    PRIMARY KEY (id)
);