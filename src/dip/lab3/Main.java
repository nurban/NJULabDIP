
package dip.lab3;

/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class Main {
    public static void main(String[] args) {
        
        String userMessageInput;
        
        //Create new objects and specify method of input/output
        InputStrategy userInput = new GUIInputMessageStrategy();
        OutputStrategy userOutput = new ConsoleOutputMessageStrategy();
        
        //pass both input and output obvjects into the service class.
        UserMessageService msgService = new UserMessageService(userInput, userOutput);
        
        //get user input and pass the inputted data to userMessageInput's getter method.
        userMessageInput = msgService.getMessageInput();
        msgService.setMessageOuput(userMessageInput);
        
    }
}
