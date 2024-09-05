package frc.robot.subsystems;

import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OnboardLED extends SubsystemBase{

    private OnBoardIO onboardIO;

    public OnboardLED(OnBoardIO onboardIO) {
        this.onboardIO = onboardIO;
    }

    public void setYellowLed(boolean value){
        this.onboardIO.setYellowLed(value);
    }
    
}
