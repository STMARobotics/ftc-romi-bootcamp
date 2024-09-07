# Lesson 3 - Control the LED with the Controller One Button
* reset the workspace so we can start with a clean slate

## Update OnboardLED Subsystem
To make it so it can toggle we will need to add some state to the class we will do this by adding a new variable
* Add a private boolean variable called yellowLEDState to the class
* In the constuctor lets set the yellowLEDState variable to false by calling setYellowLED
* add a getYellowLed method that will return the state of the yellowLED
    * `public boolean getYellowLed()`
* Go into the setYellowLed method and set the value of the yellowLEDState variable
* copy the code that sets the value on the onBoardIO system and move it to the periodic method

Periodic is s function that is called every time the loop is called. By us setting the state and having periodic set the value the value will constantly be applied to the underlying system

## Uppdate TeleopLED Command
The first if statment stays the same it still checks for the y button being pressed. But the second part is checking for x. We want to change this. We could just say anytime Y isn't pressed set it to false, but that would be doing it a lot, we only need to set it to false if it is true so we could just check that with the get function we made
* Change the else if fo check if the onBoardLED.getYellowLed() is true

## Run code 
We don't need to change the RobotContainer this time since all the components have been created. So lets save everything and run the code

This time when you press Y the yellow light should turn on, and when you release the button it will go off.

Great lets do lesson 4