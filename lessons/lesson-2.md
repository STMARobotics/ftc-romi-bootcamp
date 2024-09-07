# Lesson 2 - Control the LED with the Controller

## Reset workspace
Discard all changes - this will get you back to a spot that is the same for everyone on the lesson.

## Make OnBoardLED Subsystem
* Go to the file in the subsystems folder, OnboardLED
* Add a new private variable of type OnBoardIO and call it obBoardIO
* Update the constructor `public OnBoardLED()` to take a value of type OnBoardIO
* In the constructor set `this.onBoardIO` equal to the value passed in
* Create a method called `public void setYellowLed(boolean value)`
* in the method on this.onBoardIO call the setYellowLed method and pass in the value

## Make TeleopLED Command
* Go to the file TeleopLED in the commands folder
* Add a private variable of type OnBoardLED called onBoardLED to the Class
* Add a private of type XboxController called xboxController to the Class
* Update the constructor to take two variable 
    * OnBoardLED 
    * XboxController
* Set the class fields to the values passed into the constructor
    * this.obBoardLED = onBoardLED
    * this.xboxController = xboxController
* in the consturctor call addRequirements with the onBoardLED value to register it with the scheduler
* Update the execute method with
    * in the if block that checks that the y button being pressed is true vall this.obBoardLED.setYellowLed(true)
    * in the if block that checks if the x button is pressed do the same thing but set it to false

## Update RobotContainer
* add private final variable for the OnBoardLED `private final OnBoardLED onBoardLED = new OnBoardLED(onBoardIO)`
* Add private final xboxController variable `private final XboxController xboxController = new XboxController(0)`
* Add private TeleopLED command called led that get the onBoardLED and xboxController
* In configureButtonBindings set the default command on the onBoardLED to take the led command you made

## Run code 
Run the code if it all works right you will be able to use the xbox controller and press the y button to turn on the yellow led and the x button to turn it off. 

Great job but I wonder if we can have it just turn on when we are holding a button down

Lets go to lesson 3 