package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.acmerobotics.roadrunner.trajectory.constraints.TrajectoryVelocityConstraint;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import java.util.Vector;

import org.firstinspires.ftc.teamcode.components.Intake;
import org.firstinspires.ftc.teamcode.components.Spinner;
import org.firstinspires.ftc.teamcode.components.Arm;
import org.firstinspires.ftc.teamcode.drive.DriveConstants;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="AutoRed", group="Exercises")

public class AutoRed extends  LinearOpMode{

    //Intake
    DcMotor intakeMotor;
    Intake intake;

    //Spinner
    DcMotor spinnerMotor;
    Spinner spinner;

    //Arm
    DcMotor armMotor;
    DcMotor armMotor2;
    Arm arm;


    @Override
    public void runOpMode() throws InterruptedException{
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        //Intake
        intakeMotor = hardwareMap.dcMotor.get("intakeMotor");
        intake = new Intake(intakeMotor);

        //Spinner
        spinnerMotor = hardwareMap.dcMotor.get("spinnerMotor");
        spinner = new Spinner(spinnerMotor);

        //Arm
        armMotor = hardwareMap.dcMotor.get("armMotor");
        armMotor2 = hardwareMap.dcMotor.get("armMotor2");
        arm = new Arm(armMotor,armMotor2);





        Trajectory right = drive.trajectoryBuilder(new Pose2d())
                .strafeRight(21)
                .build();

        Trajectory forward = drive.trajectoryBuilder(right.end())
                .forward(1)
                .build();


        Trajectory park = drive.trajectoryBuilder(forward.end())
                .back(28)
                .build();


        waitForStart();

        if (isStopRequested()) return;


        drive.followTrajectory(right);
        drive.followTrajectory(forward);
        spinnerMotor.setPower(-.5);
        sleep(6500);
        spinnerMotor.setPower(0);
        drive.followTrajectory(park);
        intakeMotor.setPower(-.3);
        sleep(1000);
        intakeMotor.setPower(0);


    }
}
