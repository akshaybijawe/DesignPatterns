package strategy;

/**
 * @author arbijawe on 8/22/20
 * @project DesignPatterns
 */

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public Duck () {

    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuakBehavior(QuakBehavior qb){
        quakBehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quakBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
