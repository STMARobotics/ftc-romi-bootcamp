package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardLED extends SubsystemBase{

    private OnBoardIO onBoardIO;
    
    // Add private boolean yellowLEDState


 
    public OnBoardLED(OnBoardIO onBoardIO) {
        this.onBoardIO = onBoardIO;
        
        // set the initial state for the LED to false
        
    }
    // apply the value to the state variable and then call up to set it
    public void setYellowLed(boolean value){
        this.onBoardIO.setYellowLed(this.yellowLEDState);
    }
    
    // create get method for the yellow led


    @Override
    public void periodic() {
        // Add the this.onBoardIO.setYellowLed call here     
        
    }
}
