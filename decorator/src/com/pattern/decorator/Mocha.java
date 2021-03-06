package com.pattern.decorator;

public class Mocha extends CodimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
