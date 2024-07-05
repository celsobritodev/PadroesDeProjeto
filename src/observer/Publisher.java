package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
	private List<ISubscriber> assinantes;
	
	public Publisher() {
		this.assinantes = new ArrayList<ISubscriber>();
	}
	
	public void subscribe(ISubscriber assinante) {
		this.assinantes.add(assinante);
	}
	
	public void notifySubscribers() {
		for(ISubscriber assinante: assinantes) {
			assinante.update();
		}
	}
	
	

}
