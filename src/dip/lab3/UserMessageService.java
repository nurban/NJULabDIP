
package dip.lab3;

import java.util.Scanner;
/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class UserMessageService {
    
    private InputStrategy inputMessage;
    private OutputStrategy outputMessage;
    
    
    public UserMessageService(InputStrategy inputMessage, OutputStrategy outputMessage) {
        this.inputMessage = inputMessage;
        this.outputMessage = outputMessage;
    }
    
    public final String getMessageInput() {
        return this.inputMessage.getMessageInput();
    }
    
    public final void setMessageOuput(String userMessage) {
        //validation needed here.
        this.outputMessage.setMessageOutput(userMessage);
        
    }
}
