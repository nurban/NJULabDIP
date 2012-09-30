
package dip.lab3;

/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class ConsoleOutputMessageStrategy implements OutputStrategy {

    public void setMessageOutput(String userMessage) {
        //validation needed here.
        
        //Outputs userMessage to the console.
        System.out.println(userMessage);
    }

    
}
