package principal;

import adapter.AppAdapter;
import builder.AppBuilder;
import factory.AppFactory;
import singleton.AppSingleton;

public class Principal {

	public static void main(String[] args) {
		
	//	AppFactory.doFactory();
	//	AppSingleton.doSingleton();
	//	AppBuilder.doBuilder();
		AppAdapter.doAdapter();
		

	}

}
