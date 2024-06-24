package singleton;

public class AppSingleton {

	public static void doSingleton() {

        DatabaseSingleton db;
        
        db = DatabaseSingleton.getInstance();
        db.executarComando("select * from tbl_produto");
        
        DatabaseSingleton outroDB = DatabaseSingleton.getInstance();
        outroDB.executarComando("insert into tbl_cliente values(?,?,?)");
        
        

	}

}
