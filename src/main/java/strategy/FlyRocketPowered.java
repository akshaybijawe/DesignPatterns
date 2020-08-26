package strategy;

/**
 * @author arbijawe on 8/22/20
 * @project DesignPatterns
 */

public class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
