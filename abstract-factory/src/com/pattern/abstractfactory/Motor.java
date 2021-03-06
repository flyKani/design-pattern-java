package com.pattern.abstractfactory;

import apple.laf.JRSUIConstants.Direction;

public abstract class Motor {
  protected Door door;
  private MotorStatus motorStatus;

  public Motor(){
    this.motorStatus = MotorStatus.STOPPED;
  }

  public void setDoor(Door door){
    this.door = door;
  }

  public MotorStatus getMotorStatus(){
    return this.motorStatus;
  }

  private void setMotorStatus(MotorStatus motorStatus){
    this.motorStatus = motorStatus;
  }


  public void move(Direction direction){
    MotorStatus motorStatus = getMotorStatus();
    if(motorStatus == MotorStatus.MOVING){
      return;
    }

    DoorStatus doorStatus = door.getDoorStatus();
    if(doorStatus == DoorStatus.OPENED){
      door.close();
    }

    moveMotor(direction);
    setMotorStatus(MotorStatus.MOVING);
  }
  protected abstract void moveMotor(Direction direction);

}
