package com.sandeep.models.preperation.test;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sandeep.data.loader.ModelDataLoader;
import com.sandeep.model.ToyWeatherDecisionTreeClassifier;
import com.sandeep.model.ToyWeatherLinearRegression;
import com.sandeep.utils.constants.WeatherDTOConstants;

/**
 * Test Class for ModelEvaluators
 * 
 * Date Aug 22 2017
 * 
 * @author Sandeep
 * @version 0.1
 */

public class ModelEvaluatorsTest {
	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory.getLogger(ModelEvaluatorsTest.class);

	/**
	 * Decision Tree classifier
	 */
	private static ToyWeatherDecisionTreeClassifier classifier;

	/**
	 * Linear Regression for Temperature Prediction
	 */
	private static ToyWeatherLinearRegression temperatureModel;

	/**
	 * Linear Regression for Humidity Prediction
	 */
	private static ToyWeatherLinearRegression humidityModel;

	/**
	 * Linear Regression for Pressure Prediction
	 */
	private static ToyWeatherLinearRegression pressureModel;

	public ToyWeatherDecisionTreeClassifier getClassifier() {
		return classifier;
	}

	public ToyWeatherLinearRegression getTemperatureModel() {
		return temperatureModel;
	}

	public ToyWeatherLinearRegression getHumidityModel() {
		return humidityModel;
	}

	public ToyWeatherLinearRegression getPressureModel() {
		return pressureModel;
	}

	/**
	 * Load Datas for initial Testing
	 */
	@Before
	public void loadDatas() {
		classifier = ModelDataLoader.loadModelDatas(new ToyWeatherDecisionTreeClassifier());
		temperatureModel = ModelDataLoader.loadModelDatas(new ToyWeatherLinearRegression(), WeatherDTOConstants.TEMPERATURE);
		humidityModel = ModelDataLoader.loadModelDatas(new ToyWeatherLinearRegression(), WeatherDTOConstants.HUMIDITY);
		pressureModel = ModelDataLoader.loadModelDatas(new ToyWeatherLinearRegression(), WeatherDTOConstants.PRESSURE);
		logger.info("Loaded datas for testing com.sandeep.models.preperation.ModelEvaluators");

	}

	@Test
	public void loadDatasForTrainingTest() {
		// assertEquals(ModelEvaluators.evaluateRegressionModel(null, null),
		// void.class);

	}

}
