package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.OnboardLED;

public class TeleopLED extends Command{


    private OnboardLED onboardLED;
    private XboxController xboxController;

    public TeleopLED(OnboardLED onboardLED, XboxController xboxController) {
       this.onboardLED = onboardLED;
       this.xboxController = xboxController;
       addRequirements(onboardLED);
    }

    @Override
    public void execute() {
        if (this.xboxController.getYButton()) {
            System.out.println("Y BUTTON");
            this.onboardLED.setYellowLed(true);
        } else if (this.onboardLED.getYellowLed()){
            this.onboardLED.setYellowLed(false);
        }
    }    
    
}
