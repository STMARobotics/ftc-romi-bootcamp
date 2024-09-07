# Lesson 4 - Driving

# Update Drivetrain
The drive train is mostly set up, we just need to set a few values to make sure it will work the way we want it to.
* Go to the Drivetrain file in the subsystems folder
* in the constructor set the right motor to be inverted
    * `this.rightMotor.SetInverted(true)`
* in the arcadeDrive Method, set the values on the diff drive to the x an z axis values from the class
    * `this.diffDrive.arcadeDrive()`

# Update ArcadeDrive Command
* set the values in the class to the values passed in
* in the execute method get the value from the xAxisSpeedSupplier and the zaxisRotateSupplier and pass them into the drivtrain.arcadeDrive

# Update RobotContainer
* Go to the RobotContainer
* Add a private variable of type Drivetrain called drivetrain to the class
* Go to the bottom of the class create a public method that returns a Command called getArcadeDriveCommand
    * In ths method return a new ArcadeDrive instantiated with
    * drivetrain
    * a supplier with a lambda syntax like this `() -> -xboxController.getLeftY()` it is negative so the robot will roll the way you expect
    * a supplier with a lambda syntax like this `() -> -xboxController.getRightX()` it is negative so the robot will roll the way you expect
* In the configureButtonBindings method set the default command on the drive train with the getArcadeDriveCommand

# Run Code
Save it all, execute it, you should now be able to make the robot roll forward and backward and turn. Good job

