// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.romi.OnBoardIO;
import edu.wpi.first.wpilibj.romi.OnBoardIO.ChannelMode;
import frc.robot.commands.MyFirstCommand;
import frc.robot.commands.TeleopLED;
import frc.robot.subsystems.OnBoardLED;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final OnBoardIO onBoardIO = new OnBoardIO(ChannelMode.INPUT, ChannelMode.INPUT);
  
    // create a new OnBoardLED
    private final OnBoardLED onBoardLED = new OnBoardLED(onBoardIO);
    // Assumes a gamepad plugged into channnel 0
  
    // create new XboxController
    private final XboxController xboxController = new XboxController(0);

    
    private MyFirstCommand autoCommand = new  MyFirstCommand(onBoardIO, 10);
  
    // create new TeleopLED command
    private final TeleopLED led = new TeleopLED(onBoardLED, xboxController);

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
    
    // bind the led command to the LED Subsystem
    onBoardLED.setDefaultCommand(led);
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
}
