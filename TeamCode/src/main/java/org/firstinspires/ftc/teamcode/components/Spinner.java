package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Spinner {

    DcMotor spinnerMotor;

    public Spinner (DcMotor spinnerMotor) {
        this.spinnerMotor = spinnerMotor;

    }
    public void On(){
        this.spinnerMotor.setPower(1);
    }
    public void Off(){
        this.spinnerMotor.setPower(0);
    }
}

