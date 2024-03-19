package com.test;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

//Implement a stopwatch application that calculates the elapsed time between pressing the start and stop buttons. Use Duration to represent the elapsed time, a
//nd print it in HH:MM:SS format when the stop button is pressed.


public class Stopwatch {
    private Instant startTime;
    
    public void start() {
    	startTime = Instant.now();
    	System.out.println(startTime);
    }
    
    public Duration stop() {
        Instant endTime = Instant.now();
        System.out.println(endTime);
        return Duration.between(startTime, endTime);
    }
    
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine();
        stopwatch.start();
        
        System.out.println("Stopwatch started. Press Enter to stop...");
        scanner.nextLine();
        Duration elapsedTime = stopwatch.stop();
        
        long hours = elapsedTime.toHours();
        long minutes = elapsedTime.minusHours(hours).toMinutes();
        long seconds = elapsedTime.minusHours(hours).minusMinutes(minutes).getSeconds();
        
        System.out.println("Elapsed time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        
        scanner.close();
    }
}



