package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardLED extends SubsystemBase{

    private OnBoardIO onBoardIO;
    
    // Add private boolean yellowLEDState
    private boolean yellowLEDState;

 
    public OnBoardLED(OnBoardIO onBoardIO) {
        this.onBoardIO = onBoardIO;
        
        // set the initial state for the LED to false
        this.setYellowLed(false);
    }
    // apply the value to the state variable and then call up to set it
    public void setYellowLed(boolean value){
        this.yellowLEDState = value; 
    }
    
    // create get method for the yellow led
    public boolean getYellowLed(){
        return this.yellowLEDState;
    }

    @Override
    public void periodic() {
        // Add the this.onBoardIO.setYellowLed call here     
        this.onBoardIO.setYellowLed(this.yellowLEDState);
    }
}
