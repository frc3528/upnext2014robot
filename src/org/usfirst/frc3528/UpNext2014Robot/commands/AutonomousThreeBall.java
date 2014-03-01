/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3528.UpNext2014Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc3528.UpNext2014Robot.Robot;
import org.usfirst.frc3528.UpNext2014Robot.RobotMap;

/**
 *
 * @author TeamUpNext
 */
public class AutonomousThreeBall extends CommandGroup {
    
    public AutonomousThreeBall() {
        
        
        addSequential(new LowerPickerUpper());
        addSequential(new Fire());
        addSequential(new Wait(RobotMap.WAIT_BETWEEN_FIRE));
        addSequential(new Cock());
        addParallel(new ReversePickerUpper(1.0));
        addSequential(new DriveByFeet(-2, -0.5));
        addSequential(new DriveByFeet(12, 0.75));
        addSequential(new StartPickerUpper());
        addSequential(new Fire());
        addSequential(new Wait(RobotMap.WAIT_BETWEEN_FIRE));
        addSequential(new Cock());
        addSequential(new ReversePickerUpper(1.0));
        addSequential(new Fire());
        
        }
}
