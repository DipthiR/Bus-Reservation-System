# Bus-Reservation-System

This is a simple Bus Reservation System implemented in Java. It allows users to view available buses, book seats on a bus, and check available seats for each bus. The system provides basic functionality to manage bus reservations, ensuring smooth operations for users looking to travel via bus.

## Features
View Available Buses: Displays a list of all buses with their respective bus numbers and names.

Book Seats: Users can book available seats on a bus.

View Available Seats: Users can check which seats are available on a particular bus.

Seat Availability: Ensures that the system only allows booking of available seats and prevents double booking.

Simple Console Interface: The system uses a console-based interface for interaction.

## Requirements
To run this system, you need:

Java JDK 8 or later installed on your machine.

A text editor or an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans to run and edit the program.

Installation and Setup
### 1. Clone or Download the Project:
You can either clone the repository or download the code as a ZIP file.

git clone https://github.com/your-repository/bus-reservation-system.git
Alternatively, download the ZIP file and extract it to a folder.

### 2. Compile the Code:
Once you have the source files, compile the Java program using the javac command in your terminal or command prompt:

javac BusReservationSystem.java
### 3. Run the Program:
After compilation, run the program with the following command:

java BusReservationSystem
## Usage
When the system starts, you will see a menu with several options. You can:

Display all buses: View the list of buses with their bus numbers and names.

Book a seat: Select a bus and book an available seat by entering the seat number.

View available seats: Check which seats are available on a specific bus.

Exit the system: Exit the program.

### Example Interaction:

--- Bus Reservation System ---
1. Display all buses
2. Book a seat
3. View available seats
4. Exit
Enter your choice: 1

Available Buses:
Bus Number: A1, Bus Name: Express 101
Bus Number: B1, Bus Name: Luxury 202
Bus Number: C1, Bus Name: Economy 303
Bus Number: D1, Bus Name: City Bus 404
Bus Number: E1, Bus Name: Super Fast 505
## Class Overview
### 1. Bus Class
Attributes:

busNumber: Unique number for each bus.

busName: The name of the bus.

totalSeats: The total number of seats in the bus.

seats: A boolean array representing the status of each seat (booked or available).

## Methods:

bookSeat(int seatNumber): Books a seat if it is available.

isSeatAvailable(int seatNumber): Checks if a specific seat is available.

showAvailableSeats(): Displays all available seats in the bus.

isFullyBooked(): Checks if the bus is fully booked.

### 2. BusReservationSystem Class
Main Functionality:

Displays a menu for the user.

Manages the booking process by interacting with the Bus class.

Allows users to view available buses, book seats, and check available seats.

## Customization
You can enhance the system by adding more features like:

User Authentication: Introduce login/logout functionality for customers.

Cancellation: Add the ability for customers to cancel their reservation.

Route Information: Each bus could have specific route information like start and end locations.

Pricing: Implement dynamic pricing based on the seat or bus type.

Persistent Storage: Store bus and reservation data in a file (CSV, JSON) or a database for persistence.

