package org.firstinspires.ftc.teamcode.components;
import com.qualcomm.robotcore.hardware.DcMotor;
public class Arm {

    public DcMotor arm;
    public DcMotor arm2;

        public Arm (DcMotor armMotor, DcMotor armMotor2){
            this.arm = armMotor;
            this.arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
            this.arm2 = armMotor2;
            this.arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        public void ground() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            arm2.setPower(-1);
            arm2.setTargetPosition(-550);
            this.arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void drive() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            arm2.setPower(-1);
            arm2.setTargetPosition(-550);
            this.arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void high() {
            arm.setPower(1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            arm2.setPower(1);
            arm2.setTargetPosition(-550);
            this.arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }
        public void medium() {
            arm.setPower(-1);
            arm.setTargetPosition(-550);
            this.arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            arm2.setPower(-1);
            arm2.setTargetPosition(-550);
            this.arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        }

        public void Off() {
            arm.setPower(0);
            arm2.setPower(0);
        }
    }
