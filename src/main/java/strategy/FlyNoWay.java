package strategy;

/**
 * @author arbijawe on 8/22/20
 * @project DesignPatterns
 */

public class FlyNoWay implements  FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
