package org.firstinspires.ftc.teamcode.components;
import com.qualcomm.robotcore.hardware.DcMotor;
public class Arm {

    public DcMotor armMotor;
    public DcMotor armMotor2;

    public Arm (DcMotor armMotor, DcMotor armMotor2){
        this.armMotor = armMotor;
        this.armMotor2 = armMotor2;
    }

    public void Up() {
        armMotor.setPower(1);
        armMotor2.setPower(-1);

    }

    public void Down(){
        armMotor.setPower(-1);
        armMotor2.setPower(1);
    }
    public void off() {
        armMotor.setPower(0);
        armMotor2.setPower(0);
    }

}
