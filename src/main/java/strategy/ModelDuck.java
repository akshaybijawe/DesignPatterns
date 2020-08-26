package strategy;

/**
 * @author arbijawe on 8/22/20
 * @project DesignPatterns
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quakBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
