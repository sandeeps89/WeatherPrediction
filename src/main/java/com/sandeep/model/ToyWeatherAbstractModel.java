package com.sandeep.model;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.regression.LabeledPoint;

import com.sandeep.exceptions.ToyWeatherPredictorException;

/**
 * AbstractClassifier For machine learning model
 * 
 * Date Aug 20 2017
 * 
 * @author Sandeep
 * @version 0.1
 */
public interface ToyWeatherAbstractModel {

	/**
	 * 
	 * @param trainingData
	 * @throws ToyWeatherPredictorException
	 * 
	 *             Used for training the model
	 */
	public void trainModel(JavaRDD<LabeledPoint> trainingData) throws ToyWeatherPredictorException;

}
