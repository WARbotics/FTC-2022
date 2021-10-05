package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Arm {

    public DcMotor arm;

   public Arm (DcMotor armMotor){
        this.arm = armMotor;
        this.arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void ground(){
        arm.setTargetPosition(-550);//-550
        arm.setPower(-1);//-1
        this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void driving(){
        arm.setTargetPosition(-600);//-550
        arm.setPower(-1);//-1
        this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void low(){
        arm.setTargetPosition(-650);//-550
        arm.setPower(-1);//-1
        this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void medium(){
        arm.setTargetPosition(-700);//-550
        arm.setPower(-1);//-1
        this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void high(){
        arm.setTargetPosition(-750);//-550
        arm.setPower(-1);//-1
        this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    
    public void armOff(){
        arm.setPower(0);
    }
}
