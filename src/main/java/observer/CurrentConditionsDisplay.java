package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author arbijawe on 8/24/20
 * @project DesignPatterns
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {

        if( o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " +
                humidity + "% humidity");
    }


}
