package com.sandeep.application.test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sandeep.application.ToyWeatherPredictor;

/**
 * Test of class for getting the prediction
 * 
 * * Date Aug 23 2017
 * 
 * @author Sandeep 
 * @version 0.1
 */
public class ToyWeatherPredictorTest {

	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory.getLogger(ToyWeatherPredictorTest.class);

	/**
	 * Load Datas for initial Testing
	 */

	@Before
	public void loadDatas() {

		logger.info("loaded datas for testing com.sandeep.application.ToyWeatherPredictor");
	}

	@Test
	public void mainTest() {
		ToyWeatherPredictor testObj = new ToyWeatherPredictor();
		assertNotEquals(testObj.getClassifier(), null);
		assertNotEquals(testObj.getHumidityModel(), null);
		assertNotEquals(testObj.getTemperatureModel(), null);
		assertNotEquals(testObj.getPressureModel(), null);

		logger.info(" model fetch test.application.ToyWeatherPredictor");

	}

}
