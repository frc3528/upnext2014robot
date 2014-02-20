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
public class ThreeBallAuto extends CommandGroup {
    
    public ThreeBallAuto() {
        
        
        addSequential(new LowerPickerUpper());
        addSequential(new Wait(0.6));
        addSequential(new FireWithoutJiggle());
        addSequential(new Wait(RobotMap.WAIT_BETWEEN_FIRE));
        addSequential(new Cock());
        addParallel(new ReversePickerUpper());
        addSequential(new DriveByFeet(-2, -0.5));
        addSequential(new DriveByFeet(12, 0.75));
        addSequential(new StartPickerUpper());
        addSequential(new FireWithoutJiggle());
        addSequential(new Wait(RobotMap.WAIT_BETWEEN_FIRE));
        addSequential(new Cock());
        addSequential(new ReversePickerUpper());
        addSequential(new FireWithoutJiggle());
        
        }
}