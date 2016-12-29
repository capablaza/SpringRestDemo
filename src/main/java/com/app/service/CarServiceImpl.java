package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Car;

@Service("carService")
public class CarServiceImpl implements CarService{

	@Override
	public List<Car> getall() {
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("red", "pt-1272"));
		carList.add(new Car("black", "pt-6456"));
		carList.add(new Car("green", "pt-6456"));
		return carList;
	}

}
