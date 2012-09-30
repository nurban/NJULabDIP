
package dip.lab3;

import java.util.Scanner;
/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class ConsoleInputMessageStrategy implements InputStrategy{
    private String message;
    
    //creates a new scanner object for user input.
    Scanner keyboardInput = new Scanner(System.in);
    public String getMessageInput() {
        
        String message;
        
        //store the user's message into a variable.
        System.out.println("What would you like your message to say?");
        message = keyboardInput.nextLine();
        return message;
    }
    
}
