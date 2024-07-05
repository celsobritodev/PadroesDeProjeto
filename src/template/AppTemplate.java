package template;

public class AppTemplate {

	public static void doTemplate() {
		
		ProcessadorDados pro,pro2;
		
		pro = new ProcessadorCSV("dados.csv");
		pro.processData();
		pro.printResult();
		
		System.out.println("-----------------------------------------");
		
		pro2 = new ProcessadorHashTag("dados.hashtag");
		pro2.processData();
		pro2.printResult();
		
	}

}
