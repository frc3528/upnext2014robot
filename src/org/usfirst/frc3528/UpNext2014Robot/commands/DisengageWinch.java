/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3528.UpNext2014Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3528.UpNext2014Robot.Robot;

/**
 *
 * @author TeamUpNext
 */
public class DisengageWinch extends Command {
    
    public DisengageWinch() {
        // Use requires() here to declare subsystem dependencies
        //requires(Robot.catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(.075);
        Robot.catapult.disengageWinch();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.catapult.freeWinch();
    
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
