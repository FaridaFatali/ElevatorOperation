package org.example;

/**
 * @author Farida Fatali
 * Elevator Operation process
 * Practice about Cohesion and Coupling in Java
 */

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new ResponsibleElevator();
        elevator.openDoor();  // Get into the elevator
        elevator.go(Floor.FIFTH);

        elevator.openDoor();  // Somebody is coming
        elevator.go(Floor.FIRST);
        elevator.go(Floor.FIFTH);
    }
}