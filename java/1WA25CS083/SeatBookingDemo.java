// 1. Define a custom checked exception (extends Exception)
class SeatUnavailableException extends Exception {
private int requestedSeats;
private int availableSeats;

public SeatUnavailableException(String message, int requestedSeats, int availableSeats) {
super(message);
this.requestedSeats = requestedSeats;
this.availableSeats = availableSeats;
}

public int getRequestedSeats() {
return requestedSeats;
}

public int getAvailableSeats() {
return availableSeats;
}
}

// 2. Throw the exception when booking exceeds available seats
class Theater {
private int availableSeats = 5;

public void bookSeats(int seatsToBook) throws SeatUnavailableException {
if (seatsToBook <= 0) {
throw new IllegalArgumentException("Number of seats must be greater than zero.");
}
if (seatsToBook > availableSeats) {
throw new SeatUnavailableException(
"Not enough seats available",
seatsToBook,
availableSeats
);
}
availableSeats -= seatsToBook;
System.out.println("Successfully booked " + seatsToBook + " seat(s). Remaining: " + availableSeats);
}
}

// 3. Catch and handle the exception in main
public class SeatBookingDemo {
public static void main(String[] args) {
Theater theater = new Theater();

try {
theater.bookSeats(3); // Succeeds (2 seats left)
theater.bookSeats(4); // Triggers SeatUnavailableException
} catch (SeatUnavailableException e) {
System.out.println(
e.getMessage() + ". Requested: " + e.getRequestedSeats() +
", Available: " + e.getAvailableSeats()
);
}
}
}
