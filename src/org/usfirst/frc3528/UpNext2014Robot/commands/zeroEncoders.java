/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3528.UpNext2014Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3528.UpNext2014Robot.Robot;
import org.usfirst.frc3528.UpNext2014Robot.RobotMap;

/**
 *
 * @author TeamUPNext
 */
public class zeroEncoders extends Command {
    
    public zeroEncoders() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("--- zeroing jags ---");
        Robot.mecanumDrive.zeroEncoders(RobotMap.frontLeftMotor);
        Robot.mecanumDrive.zeroEncoders(RobotMap.backLeftMotor);
        Robot.mecanumDrive.zeroEncoders(RobotMap.frontRightMotor);
        Robot.mecanumDrive.zeroEncoders(RobotMap.backRightMotor);

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
