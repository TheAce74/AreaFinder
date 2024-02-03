package areafinder;

import java.util.Scanner;

public class AreaFinder {

    public static void main(String[] args) {
        //welcome user and introduce console app
        System.out.println("Welcome User \nThis program calculates the area of a circle and a sector bounding 65 degrees of the circle");
        System.out.println("Enter the radius of the circle");
        
        //initialize scanner instance
        Scanner scanner = new Scanner(System.in);
        
        //take radius as user input
        int radius = scanner.nextInt();
        
        //run calculations and display output
        double circleArea = Math.PI * Math.pow(radius, 2);
        double sectorArea = circleArea * 65 / 360;
        System.out.println("The area of the circle is " + circleArea);
        System.out.println("The area of the sector is " + sectorArea);
    }
    
}
