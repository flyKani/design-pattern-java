package com.pattern.strategy;

public class WalkingStrategy implements MovingStrategy {
  @Override
  public void move(){
    System.out.println("I can walk");
  }
}