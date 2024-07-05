package observer;

public class AppObserver {

	public static void doObserver() {
		
		Publisher publisher = new Publisher();
		
		publisher.subscribe(new Assinante(1));
		publisher.subscribe(new Assinante(2));
		publisher.subscribe(new Assinante(3));
		
		publisher.notifySubscribers();

	}

}
