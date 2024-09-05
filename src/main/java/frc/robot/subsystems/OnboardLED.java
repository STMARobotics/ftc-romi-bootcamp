package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnboardLED extends SubsystemBase{

    private OnBoardIO onboardIO;
    private boolean yellowLEDState;

    public OnboardLED(OnBoardIO onboardIO) {
        this.onboardIO = onboardIO;
        this.yellowLEDState = false;
        this.setYellowLed(yellowLEDState);
    }

    public void setYellowLed(boolean value){
        this.yellowLEDState = value; 
    }
    
    public boolean getYellowLed(){
        return this.yellowLEDState;
    }

    @Override
    public void periodic() {
        onboardIO.setYellowLed(this.yellowLEDState);
    }
}
