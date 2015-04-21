
public class StatisticsDisplay implements Observer,DisplayElement{

	private float temperature= 1000000;
	private float humidity= 1000000;
	private float pressure= 1000000;
	private Subject weatherData ;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = (this.temperature > temperature) ? temperature:this.temperature;
		this.humidity = (this.humidity > humidity) ? humidity:this.humidity;
		this.pressure = (this.pressure > pressure) ? pressure:this.pressure;
		display();
	}
	
	public void display() {
		System.out.println("min: " + temperature 
			+ "F degrees and " + humidity + "% humidity"+ " and pressure "+pressure);
	} 

}
