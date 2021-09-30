package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    DcMotor  intakemotor;




    public Intake (DcMotor intakemotor){
        this.intakemotor = intakemotor;


    }
    public void intakeForward(){
        this.intakemotor.setPower(1);
    }
    public void intakeBackwards(){
        this.intakemotor.setPower(-1);
    }
    public void intakeOff(){
        this.intakemotor.setPower(0);
    }
}
