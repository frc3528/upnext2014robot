/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3528.UpNext2014Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author TeamUpNext
 */
public class TwoBallAuto extends CommandGroup {
    
    public TwoBallAuto() {
        addSequential(new LowerPickerUpper());
        addSequential(new Wait(0.7));
        addSequential(new FireWithoutJiggle());
        addSequential(new Wait(1.0));
        addSequential(new Cock());
        addSequential(new StartPickerUpper());


        
        
        
        
        
    }
}
