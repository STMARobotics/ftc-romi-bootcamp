package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnBoardLED extends SubsystemBase{

    private OnBoardIO onBoardIO;
    private boolean yellowLEDState;

 
    public OnBoardLED(OnBoardIO onBoardIO) {
        this.onBoardIO = onBoardIO;
        this.setYellowLed(false);
    }
    public void setYellowLed(boolean value){
        this.yellowLEDState = value; 
    }
    
    public boolean getYellowLed(){
        return this.yellowLEDState;
    }

    @Override
    public void periodic() { 
        this.onBoardIO.setYellowLed(this.yellowLEDState);
    }
}
