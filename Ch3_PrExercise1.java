package csm10j.lab.pkg2;
import java.util.*;
import java.io.*;

/**
 * Jonas Boudreau
 * CSM10J Lab #2
 */
public class CSM10JLab2 {
    static Scanner console = new Scanner(System.in);
    
    //Declare appropriate variables
    public static void main(String[] args)
            throws FileNotFoundException
    {
        //Create and associate the stream objects
        Scanner inFile = new Scanner(new FileReader("inData.txt"));
        PrintWriter outFile = new PrintWriter("outData.txt");
        
        //Rectange Calculations
        double length;
        double width;
        double perimeter;
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        perimeter = (length * 2) + (width * 2);
        outFile.println("Rectangle:");
        outFile.println("Length = " + length + ' ' 
                + "width = " + width + ' ' 
                + "perimeter = " + String.format("%.2f", perimeter));
        
        
        //Circle Calculations
        double radius;
        double area;
        double circumference;
        radius = inFile.nextDouble();
        area = (3.1416 * Math.pow(radius, 2));
        circumference = (2 * 3.1416 * radius);
        outFile.println("\n");
        outFile.println("Circle:");
        outFile.println("Radius = " + String.format("%.2f", radius) + ' ' 
                + "area = " + String.format("%.2f", area) + ' ' 
                + "circumference = " + String.format("%.2f", circumference));
        
        //Name
        String firstName;
        String lastName;
        int age;
        firstName = inFile.next();
        lastName = inFile.next();
        age = inFile.nextInt();
        outFile.println("\n");
        outFile.println("Name: " + firstName + ' ' 
                + lastName + "," + ' ' 
                + "age: " + age);
        
        //Savings Account
        double savBalance;
        double interestRate;
        double newBalance;
        savBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();
        newBalance = (savBalance * interestRate) + (savBalance);
        outFile.println("\n");
        outFile.println("Beginning Balance = $" + String.format("%.2f", savBalance) + "," + ' ' 
                + "interest rate = " + String.format("%.2f", interestRate));
        outFile.println("Balance at the end of the month = $" + String.format("%.2f", newBalance));
        
        //ASCII Characters
        char letter;
        char nextLetter;
        letter = inFile.next().charAt(0);
        nextLetter = letter++;
        outFile.println("\n");
        outFile.println("The character that comes after " + letter 
                + " in the ASCII set is " + nextLetter);
        
        inFile.close();
        outFile.close();
        
    }
    
}
