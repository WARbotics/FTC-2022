package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.hardware.motors.RevRobotics20HdHexMotor;
import com.qualcomm.robotcore.hardware.DcMotor;import com.qualcomm.hardware.kauailabs.NavxMicroNavigationSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.ElapsedTime;


public class Drive {
    public DcMotor leftFront;
    public DcMotor leftBack;
    public DcMotor rightFront;
    public DcMotor rightBack;

    public Drive(DcMotor leftFront, DcMotor leftBack, DcMotor rightFront, DcMotor rightBack) {
        this.leftFront=leftFront;
        this.leftBack=leftBack;
        this.rightBack=rightBack;
        this.rightFront=rightFront;
    }

    public void driveCartesian(double x, double y, double theta){

        leftFront.setPower((y - x - theta)*1.80);
        rightFront.setPower((y + x + theta)*1.80);
        leftBack.setPower((y + x - theta));
        rightBack.setPower((y - x + theta));



    }

    public void driveForward(int distance){
        rightBack.setTargetPosition(distance);
        leftBack.setTargetPosition(distance);

        leftBack.setPower(1);
        rightBack.setPower(-1);

        leftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
}
