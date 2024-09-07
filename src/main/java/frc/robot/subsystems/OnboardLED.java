package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardLED extends SubsystemBase{

        // Add Private OnBoardIO variable 
    private OnBoardIO onBoardIO;
    private boolean yellowLEDState;

    // Update the constructor to accept a OnBoardIO value
    // set this.onboardIO = onboardIO;
    public OnBoardLED(OnBoardIO onBoardIO) {
        this.onBoardIO = onBoardIO;
        this.yellowLEDState = false;
        this.setYellowLed(yellowLEDState);
    }
    // Create a setter called setYellowLed that takes a boolean called setYellowLed
    // thake that value and use it on this.onboardIO.setYellowLed
    public void setYellowLed(boolean value){
        this.yellowLEDState = value; 
        this.onBoardIO.setYellowLed(value);
    }
    
    public boolean getYellowLed(){
        return this.yellowLEDState;
    }

    @Override
    public void periodic() {
        onBoardIO.setYellowLed(this.yellowLEDState);
    }
}
