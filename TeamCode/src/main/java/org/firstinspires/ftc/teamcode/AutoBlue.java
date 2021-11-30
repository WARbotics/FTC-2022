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
import org.firstinspires.ftc.teamcode.components.Drive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="AutoBlue", group="Exercises")

public class AutoBlue extends LinearOpMode{


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



        Trajectory forward = drive.trajectoryBuilder(new Pose2d())
                .forward(6)
                .build();


        Trajectory right = drive.trajectoryBuilder(forward.end())
                .strafeRight(24)
                .build();
        TrajectorySequence turn = drive.trajectorySequenceBuilder(right.end())
                .turn(Math.toRadians(-29))
                .build();

        Trajectory back = drive.trajectoryBuilder(turn.end())
                .back(1)
                .build();

        TrajectorySequence parkTurn = drive.trajectorySequenceBuilder(back.end())
                .turn(Math.toRadians(30))
                .build();

        Trajectory park = drive.trajectoryBuilder(parkTurn.end())
                .forward(24)
                .build();

        Trajectory park2 = drive.trajectoryBuilder(park.end())
                .strafeRight(5)
                .build();


        waitForStart();

        if (isStopRequested()) return;

        drive.followTrajectory(forward);
        drive.followTrajectory(right);
        drive.followTrajectorySequence(turn);
        drive.followTrajectory(back);
        spinnerMotor.setPower(.5);
        sleep(6500);
        spinnerMotor.setPower(0);
        drive.followTrajectorySequence(parkTurn);
        drive.followTrajectory(park);
        drive.followTrajectory(park2);
        intakeMotor.setPower(-.3);
        sleep(500);
        intakeMotor.setPower(0);



    }
}