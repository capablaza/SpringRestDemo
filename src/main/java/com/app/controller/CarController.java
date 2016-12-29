package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Car;
import com.app.service.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;
	
	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public ResponseEntity<List<Car>> listAll() {
		return new ResponseEntity<List<Car>>(carService.getall(), HttpStatus.OK);
	}
}
