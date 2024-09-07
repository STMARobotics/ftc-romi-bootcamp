// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj.romi.OnBoardIO.ChannelMode;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.MyFirstCommand;
import frc.robot.commands.TeleopLED;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.OnBoardLED;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    private final OnBoardIO onBoardIO = new OnBoardIO(ChannelMode.INPUT, ChannelMode.INPUT);
    private final OnBoardLED onBoardLED = new OnBoardLED(onBoardIO);
    private final XboxController xboxController = new XboxController(0);
    private MyFirstCommand autoCommand = new  MyFirstCommand(onBoardIO, 10);
    private final TeleopLED led = new TeleopLED(onBoardLED, xboxController);

    // add a private variable for the drive train
    


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link edu.wpi.first.wpilibj.GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    onBoardLED.setDefaultCommand(led);

    // set the default command on the drive train to be the getArcadeDriveCommand()
   
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return autoCommand;
  }

  // Create a public method call getArcadeDriveCommand that will return a command
  // in it return a new Arcade Drive that is instatiated with the drive train and the suppliers
  
}
