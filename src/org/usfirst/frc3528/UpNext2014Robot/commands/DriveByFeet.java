/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3528.UpNext2014Robot.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3528.UpNext2014Robot.Robot;
import org.usfirst.frc3528.UpNext2014Robot.RobotMap;

/**
 *
 * @author TeamUPNext
 */
public class DriveByFeet extends Command {
    
    double distance;
    
    public DriveByFeet(double distance) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.mecanumDrive);
        this.distance = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.mecanumDrive.driveByFeet(RobotMap.frontLeftMotor, distance);
        Robot.mecanumDrive.driveByFeet(RobotMap.frontRightMotor, distance);
        Robot.mecanumDrive.driveByFeet(RobotMap.backLeftMotor, distance);
        Robot.mecanumDrive.driveByFeet(RobotMap.backRightMotor, distance);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        try{
            System.out.println("FR = " + RobotMap.frontLeftMotor.getPosition());
         }catch (CANTimeoutException ex) {
            System.out.println("--- Error Printing Encoder ---");
                ex.printStackTrace();
             }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
