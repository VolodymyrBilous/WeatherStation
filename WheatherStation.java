
public class WheatherStation {

	
	public static void main(String[] args) {
		WheatherData weatherData = new WheatherData();
		
		//@SuppressWarnings("unused")
		//CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		new CurrentConditionsDisplay(weatherData);
		//@SuppressWarnings("unused")
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
