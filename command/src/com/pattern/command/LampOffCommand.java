package com.pattern.command;

public class LampOffCommand implements Command {

  private Lamp lamp;

  public LampOffCommand(Lamp lamp){
    this.lamp = lamp;
  }

  @Override
  public void execute() {
    lamp.turnOff();
  }
}