
package dip.lab3;

import javax.swing.JOptionPane;
/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class GUIInputMessageStrategy implements InputStrategy{
    
    private String message;
  
    
    public String getMessageInput() {
        String message;
        
        //Brings up a GUI input dialog box and prompts user for a message. The message is
        //then stored in the "message" variable.
        message = JOptionPane.showInputDialog(null, "What would you like your message to say?");
        return message;
        
    }
    
}
