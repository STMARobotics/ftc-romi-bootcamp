package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.OnBoardLED;

public class TeleopLED extends Command{

    // Add private variable for OnBoardLED
    private OnBoardLED onBoardLED;

    // Add private variable for XboxController
    private XboxController xboxController;

    // Update constructor to take the OnboardLED and the XboxController and set the values
    public TeleopLED(OnBoardLED onBoardLED, XboxController xboxController) {
       this.onBoardLED = onBoardLED;
       this.xboxController = xboxController;

       // call addRequiremens with the onBoardLed 
       addRequirements(onBoardLED);
    }

    @Override
    public void execute() {

        // make it that when the y button is pressed the yellow led is set to true and
        // on the x button it is set to false 
        if (this.xboxController.getYButton()) {
            System.out.println("Y BUTTON");
<<<<<<< HEAD
            this.onboardLED.setYellowLed(true);
        } else if (this.onboardLED.getYellowLed()){
            this.onboardLED.setYellowLed(false);
=======
            this.onBoardLED.setYellowLed(true);
        } else if (this.xboxController.getXButton()) {
            System.out.println("X BUTTON");
            this.onBoardLED.setYellowLed(false);
>>>>>>> lesson-2-solution
        }
    }    
    
}
