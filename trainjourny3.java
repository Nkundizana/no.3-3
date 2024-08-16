/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class trainjourny2 {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int distancePerPassengerStop = 150;
        int distancePerRefuelStop = 200;
        int speedKmPerHr = 250;
        int stopTimeMinutes = 5;

        int passengerStops = totalDistance / distancePerPassengerStop;
        int refuelStops = totalDistance / distancePerRefuelStop;

        int totalStops = Math.max(passengerStops, refuelStops);

        // Calculate the travel time without stops
        double travelTimeHours = (double) totalDistance / speedKmPerHr;

        // Add the stop time
        double totalStopTimeHours = (double) totalStops * stopTimeMinutes / 60;

        // Total time including stops
        double totalTime = travelTimeHours + totalStopTimeHours;

        System.out.println("Total time taken from Kampala to Kabale: " + totalTime + " hours");
    }
}

    

