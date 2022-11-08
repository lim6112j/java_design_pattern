package com.designpattern.tutorial;

import com.designpattern.tutorial.observer.CurrentConditionsDisplay;
import com.designpattern.tutorial.observer.WeatherData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new MuteQuack());
		mallard.performFly();
		mallard.performQuack();

		// observer
		//
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		// weatherData.removeObserver(currentDisplay);
		weatherData.setMeasurements(40, 45, 40.4f);

	}

}
