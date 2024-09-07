package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.OnBoardLED;

public class TeleopLED extends Command{

    // Add private variable for OnBoardLED
    

    // Add private variable for XboxController
    

    // Update constructor to take the OnboardLED and the XboxController and set the values
    public TeleopLED() {
       

       // call addRequiremens with the onBoardLed 
       
    }

    @Override
    public void execute() {

        // make it that when the y button is pressed the yellow led is set to true and
        // on the x button it is set to false 
        if (this.xboxController.getYButton()) {
            System.out.println("Y BUTTON");
            // add code here
        } else if (this.xboxController.getXButton()) {
            System.out.println("X BUTTON");
            // add code here
        }
    }    
    
}
