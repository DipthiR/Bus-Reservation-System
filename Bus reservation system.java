import java.util.Scanner;

class Bus {
    private String busNumber;
    private String busName;
    private int totalSeats;
    private boolean[] seats; // true for booked, false for available

    public Bus(String busNumber, String busName, int totalSeats) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats]; // All seats are initially available
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= totalSeats && !seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            return true;
        }
        return false;
    }

    public boolean isSeatAvailable(int seatNumber) {
        return seatNumber >= 1 && seatNumber <= totalSeats && !seats[seatNumber - 1];
    }

    public void showAvailableSeats() {
        System.out.println("Available seats in " + busName + " (" + busNumber + "):");
        for (int i = 0; i < totalSeats; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    public boolean isFullyBooked() {
        for (boolean seat : seats) {
            if (!seat) return false; // Seat is available
        }
        return true; // All seats are booked
    }
}

public class BusReservationSystem {
    private static Bus[] buses = new Bus[5];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initializing buses
        buses[0] = new Bus("A1", "Express 101", 10);
        buses[1] = new Bus("B1", "Luxury 202", 15);
        buses[2] = new Bus("C1", "Economy 303", 20);
        buses[3] = new Bus("D1", "City Bus 404", 10);
        buses[4] = new Bus("E1", "Super Fast 505", 15);

        // Main menu
        while (true) {
            System.out.println("\n--- Bus Reservation System ---");
            System.out.println("1. Display all buses");
            System.out.println("2. Book a seat");
            System.out.println("3. View available seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllBuses();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    viewAvailableSeats();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display all available buses
    private static void displayAllBuses() {
        System.out.println("\nAvailable Buses:");
        for (Bus bus : buses) {
            System.out.println("Bus Number: " + bus.getBusNumber() + ", Bus Name: " + bus.getBusName());
        }
    }

    // Book a seat
    private static void bookSeat() {
        System.out.print("\nEnter Bus Number to book a seat: ");
        String busNumber = scanner.next();
        Bus bus = findBusByNumber(busNumber);

        if (bus != null) {
            bus.showAvailableSeats();
            if (bus.isFullyBooked()) {
                System.out.println("Sorry, this bus is fully booked.");
                return;
            }

            System.out.print("Enter the seat number to book: ");
            int seatNumber = scanner.nextInt();

            if (bus.isSeatAvailable(seatNumber)) {
                if (bus.bookSeat(seatNumber)) {
                    System.out.println("Seat " + seatNumber + " successfully booked on " + bus.getBusName());
                } else {
                    System.out.println("Error booking the seat. Try again.");
                }
            } else {
                System.out.println("Seat " + seatNumber + " is not available.");
            }
        } else {
            System.out.println("Bus not found.");
        }
    }

    // View available seats in a specific bus
    private static void viewAvailableSeats() {
        System.out.print("\nEnter Bus Number to view available seats: ");
        String busNumber = scanner.next();
        Bus bus = findBusByNumber(busNumber);

        if (bus != null) {
            bus.showAvailableSeats();
        } else {
            System.out.println("Bus not found.");
        }
    }

    // Find bus by its number
    private static Bus findBusByNumber(String busNumber) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equals(busNumber)) {
                return bus;
            }
        }
        return null;
    }
}
