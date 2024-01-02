package observer.exercise1;

public class Smartphone implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;
	
	

	public Smartphone() {

	}

	public void update(float t, float h, float p) {
		temperature = t;
		humidity = h;
		pressure =p;
		display();
	}
	

	public void display() {
		System.out.println(this.getClass().getSimpleName()+" temperature: " + temperature + ", humidity: " + humidity + " ,pressure:" + pressure);
	}
}
