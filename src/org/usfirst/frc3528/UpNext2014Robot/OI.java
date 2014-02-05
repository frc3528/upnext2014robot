package org.usfirst.frc3528.UpNext2014Robot;


import org.usfirst.frc3528.UpNext2014Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * ThIs class Is the glue that bInDs the controls on the PhysIcal oPerator
 Interface to the commanDs anD commanD grouPs that allow control of the robot.
 */
public class OI {

    
    
    public Joystick driveStick;
    public Joystick controlStick;
    public JoystickButton Fire;
    public JoystickButton PrimeCatapult;
    public JoystickButton DisengageWinch;
    public JoystickButton EngageWinch;
    public JoystickButton StartPickerUpperWheels;
    public JoystickButton StopPickerUpperWheels;
    public JoystickButton Latch;
    public JoystickButton IncreaseSensitivity;
    public JoystickButton DecreaseSensitivity;
    public JoystickButton EnableTalon;


    public OI() {       
    
        // create joysticks
        driveStick = new Joystick(1);

        IncreaseSensitivity = new JoystickButton(driveStick, RobotMap.DRIVE_START_BUTTON);
        IncreaseSensitivity.whenPressed(new IncreaseSensitivity());
        
        DecreaseSensitivity = new JoystickButton(driveStick, RobotMap.DRIVE_BACK_BUTTON);
        DecreaseSensitivity.whenPressed(new DecreaseSensitivity());
        
        
        controlStick = new Joystick(2);

        Fire = new JoystickButton(controlStick, RobotMap.CTRL_A_BUTTON);
        Fire.whenPressed(new Fire());

        //PrimeCatapult = new JoystickButton(controlStick, RobotMap.CTRL_B_BUTTON);
        //PrimeCatapult.whenPressed(new PrimeCatapult());
        
        DisengageWinch = new JoystickButton(controlStick, RobotMap.CTRL_Y_BUTTON);
        DisengageWinch.whenPressed(new DisengageWinch());
        
        EngageWinch = new JoystickButton(controlStick, RobotMap.CTRL_X_BUTTON);
        EngageWinch.whenPressed(new EngageWinch());

        StartPickerUpperWheels = new JoystickButton(controlStick, RobotMap.CTRL_L_BUMPER);
        StartPickerUpperWheels.whenPressed(new StartPickerUpper());

        StopPickerUpperWheels = new JoystickButton(controlStick, RobotMap.CTRL_R_BUMPER);
        StopPickerUpperWheels.whenPressed(new StopPickerUpper());
        
        //testing v
        Latch = new JoystickButton(controlStick, RobotMap.CTRL_B_BUTTON);
        Latch.whenPressed(new Latch());
        
        EnableTalon = new JoystickButton(controlStick, RobotMap.CTRL_RIGHT_STICK_CLICK);
        EnableTalon.whenPressed(new DriveWinchWithJoystick());
        //testing ^
        

           

        //SmartDashboard Buttons
        SmartDashboard.putData("Autonomous", new Autonomous());
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
        //SmartDashboard.putData("Fire", new solenoidOn());
        //SmartDashboard.putData("Retract", new DriveWinchWithJoystick());
        //SmartDashboard.putData("Fire", new Fire());
    
    }
    
    
    public Joystick getDriveStick() {
        return driveStick;
    }

    
    public Joystick getControlStick() {
        return controlStick;
    }
    
}
