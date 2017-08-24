# Predicting the weather of the toy simulator
Machine Learning model for weather generation using Java and Spark

## Problem
The problem was to develop a toy weather predictor which can generate weather conditions for a given location for a given time.

This can be achieved by collecting the historical data and observe the change in weather based on parameters like latitude, time etc..  

This can be achieved by using various machine learning algorithms given in spark Mllib.


#### The Approach
The machine learning approach needs  data. Spark provides various machine learning algorithms to build the model.

The model first train the data, tests and finds the accuracy.

The model is then used to predict the results.

We use regression and classification algorithm for the above solutions.

Regression algorithm is used to predict various parameters like temperature, pressure, humidity and weather condition while we use regression  models for predicting the weather condition.



## Prerequisite

[Java 1.7](https://java.com/en/download/) and [Apache Spark 1.6.0](https://spark.apache.org/releases/spark-release-1-6-0.html) must be installed in the system.

## Getting Started
To run the application, 
Change PopertyFile **ml.properties** accordingly

Build the maven project

```
mvn clean install  
```

## Run the project
Follow the steps to get output  

To Create Models
```
spark-submit --class com.sandeep.models.preperation.ModelTraining <jarlocation>
eg:  
```

To Evaluate Models
```
 spark-submit --class com.sandeep.models.preperation.ModelEvaluators <jarlocation>
eg: spark-submit --class com.sandeep.models.preperation.ModelEvaluators ToyWeatherPrediction-0.0.1-SNAPSHOT.jar
```


To Predict Weather
```
spark-submit --class com.sandeep.application.ToyWeatherPredictor <jarlocation> --lat <latitiude> --long <longitude> --ele <elevation> --time <unixTimeStamp>  --out <outputLocation>
eg: spark-submit --class com.sandeep.application.ToyWeatherPredictor ToyWeatherPrediction-0.0.1-SNAPSHOT.jar --lat -33.8688197 --long 151.2092955 --ele 24.5399284363 --time 1490147427  --out /resuts/prediction.txt
```


```
##Command line arguments 

--help          Displays help  
--lat            **Latitiude of the location 
--lon            **Longitude of the location
--ele            **Elevation of the location 
--time           **Unix TimeStamp
--out		 **Output Location





**  -> Mandatory arguments  

Test cases.
1. Validating the libsvm file if the labelling is done properly.
2. Validating that the model is build sucessfully.
3. Validate the accuracy of the model by finding the R2 value and checking if the value is greater than 0.8.
4. Validate that the prediction is done as expected, ie categorical value is displayed for tree algorithm and numerical value is displayed for regression algorithm.