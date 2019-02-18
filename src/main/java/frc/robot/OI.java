/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.SwitchCamera;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
@SuppressWarnings("unused")
public class OI {
  private static final int A_BUTTON_XBOX = 1;
  private static final int B_BUTTON_XBOX = 2;
  private static final int X_BUTTON_XBOX = 3;
  private static final int Y_BUTTON_XBOX = 4;
  private static final int LEFT_BUMPER_XBOX = 5;
  private static final int RIGHT_BUMPER_XBOX = 6;
  private static final int START_ARROW = 8;
  private static final int BUTTON_1_JOYSTICK = 1;
  private static final int BUTTON_6_JOYSTICK = 6;
  private static final int BUTTON_7_JOYSTICK = 7;
  private static final int BUTTON_11_JOYSTICK = 11;
  private static final int BUTTON_2_JOYSTICK = 2;
  private static final int BUTTON_8_JOYSTICK = 8;
  private final Joystick driverJoystick = new Joystick(0);
  private final XboxController manipulatorJoystick = new XboxController(1);

  Button switchCamera = new JoystickButton(driverJoystick, BUTTON_1_JOYSTICK);


  public OI() {
    switchCamera.whenPressed(new SwitchCamera());
  }

  public Joystick getDriverJoystick() {
    return driverJoystick;
  }

  public XboxController getXboxController() {
    return manipulatorJoystick;
  }
}
