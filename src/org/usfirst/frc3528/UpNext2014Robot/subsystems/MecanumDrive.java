// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3528.UpNext2014Robot.subsystems;
import org.usfirst.frc3528.UpNext2014Robot.RobotMap;
import org.usfirst.frc3528.UpNext2014Robot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3528.UpNext2014Robot.Utils;


/**
 *
 */
public class MecanumDrive extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController jaguar1 = RobotMap.frontLeftMotor; // front left   
    SpeedController jaguar2 = RobotMap.backLeftMotor; // back left
    SpeedController jaguar3 = RobotMap.frontRightMotor; // front right
    SpeedController jaguar4 = RobotMap.backRightMotor; // back right
    RobotDrive robotDrive = RobotMap.mecanumDriveRobotDrive;
    Gyro gyro1 = RobotMap.mecanumDriveGyro1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public MecanumDrive() {
        
        //super();
        
        //setJagLocations();
        
        robotDrive = new RobotDrive(jaguar1,jaguar2,jaguar3,jaguar4);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

        //initializeJag(cANJaguar1);
        //initializeJag(cANJaguar2);
        //initializeJag(cANJaguar3);
        //initializeJag(cANJaguar4);       
                
                
   }
       
    public void driveWithJoystick(Joystick joystick) {
        
        //DEBUG: debugging drivetrain
        System.out.println("working");
        
        driveWithJoystick(joystick.getX(), joystick.getY(), joystick.getZ(), 0);
   }
    
    public void driveWithJoystick(double x, double y, double rotation, double gyroAngle) {
        robotDrive.mecanumDrive_Cartesian(Utils.rampSpeed(x, RobotMap.SENSITIVITY), Utils.rampSpeed(y, RobotMap.SENSITIVITY), Utils.rampSpeed(-1 * rotation, RobotMap.SENSITIVITY), 0);
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
     }
    
    
    //XXX ----> Here is the biggest issue...no default command <----
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
