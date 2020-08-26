package observer;

/**
 * @author arbijawe on 8/24/20
 * @project DesignPatterns
 */

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
