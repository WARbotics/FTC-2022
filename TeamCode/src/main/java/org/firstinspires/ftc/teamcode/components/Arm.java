package org.firstinspires.ftc.teamcode.components;
import com.qualcomm.robotcore.hardware.DcMotor;
public class Arm {

    public DcMotor arm;

        public Arm (DcMotor armMotor){
            this.arm = armMotor;
            this.arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        public void ground() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void drive() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void high() {
            arm.setPower(1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void medium() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void low() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void Off() {
            arm.setPower(0);
        }
    }
