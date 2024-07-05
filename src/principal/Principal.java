package principal;

import adapter.AppAdapter;
import builder.AppBuilder;
import command.AppCommand;
import decorator.AppDecorator;
import factory.AppFactory;
import observer.AppObserver;
import singleton.AppSingleton;
import template.AppTemplate;

public class Principal {

	public static void main(String[] args) {
		
	//	AppFactory.doFactory();
	//	AppSingleton.doSingleton();
	//	AppBuilder.doBuilder();
	//	AppAdapter.doAdapter()
	//	AppDecorator.doDecorator();
	//	AppCommand.doCommand();
	//	AppObserver.doObserver();
		AppTemplate.doTemplate();

	}

}
