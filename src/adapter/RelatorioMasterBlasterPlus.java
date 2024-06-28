package adapter;

public class RelatorioMasterBlasterPlus {

	public void generateReport(String[] csvData) {
		System.out.println("New Report v1.0");
		System.out.println("===================");
		for (String s : csvData) {
			System.out.println(s);
		}
		System.out.println("===================");
	}
}
