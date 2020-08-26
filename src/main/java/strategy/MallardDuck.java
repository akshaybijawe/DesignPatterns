package strategy;

/**
 * @author arbijawe on 8/22/20
 * @project DesignPatterns
 */

public class MallardDuck extends Duck{

    public MallardDuck(){
        quakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
