package singleton;

public class DatabaseSingleton {
	
	private static DatabaseSingleton instance;
	
    
	// o proposito do construtor private é ficar indisponivel para outras classes
	private DatabaseSingleton() {
		System.out.println("Connecting on MySQL server...");
    }
	
	public static DatabaseSingleton getInstance() {
		
		if (instance == null) {
			instance = new DatabaseSingleton();
		}
		return instance;
	}
	
	
	public void executarComando(String comando) {
		System.out.println("MySQL> "+comando);
	}
	
}
