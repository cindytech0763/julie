package displaying_time;
import java.util.Scanner;
public class Displaying_time {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example input: total seconds
        System.out.print("Enter total seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate minutes and remaining seconds
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        // Display the result
        System.out.println("Minutes: " + minutes); 
        System.out.println("Remaining Seconds: " + remainingSeconds);
        
        scanner.close();
    }
}

    
   
