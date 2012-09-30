
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Neil Urban
 * Version: 1.00
 */
public class GUIOutputMessageStrategy implements OutputStrategy {
    
    public void setMessageOutput(String userMessage) {
        //validation needed here.
        
        //Outputs userMessage in a GUI window.
        JOptionPane.showMessageDialog(null, userMessage);
    }
}
