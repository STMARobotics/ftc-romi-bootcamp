package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardLED extends SubsystemBase{

    // Add Private OnBoardIO variable 
    private OnBoardIO onBoardIO;

    // Update the constructor to accept a OnBoardIO value
    // set this.onboardIO = onboardIO;
    public OnBoardLED(OnBoardIO onBoardIO) {
        this.onBoardIO = onBoardIO;
    }

    // Create a setter called setYellowLed that takes a boolean called setYellowLed
    // thake that value and use it on this.onboardIO.setYellowLed
    public void setYellowLed(boolean value){
        this.onBoardIO.setYellowLed(value);
    }
    
}
