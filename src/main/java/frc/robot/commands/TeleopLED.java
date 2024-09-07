package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.OnBoardLED;

public class TeleopLED extends Command{

    private OnBoardLED onBoardLED;

    private XboxController xboxController;

    public TeleopLED(OnBoardLED onBoardLED, XboxController xboxController) {
       this.onBoardLED = onBoardLED;
       this.xboxController = xboxController;
       addRequirements(onBoardLED);
    }

    @Override
    public void execute() {
        // change the else if to only set it to false if it is true
        if (this.xboxController.getYButton()) {
            System.out.println("Y BUTTON");
            this.onBoardLED.setYellowLed(true);
        } else if (this.xboxController.getXButton()) {
            this.onBoardLED.setYellowLed(false);
        } 
    }    
    
}
