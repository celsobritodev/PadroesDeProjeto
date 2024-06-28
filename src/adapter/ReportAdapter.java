package adapter;

public class ReportAdapter implements IRelatorio{

	private RelatorioMasterBlasterPlus report;
	
	public ReportAdapter() {
		this.report = new RelatorioMasterBlasterPlus();
	}
	
	
	@Override
	public void gerarRelatorio(String dados) {
		// aqui eu faço a logica de adaptacao
		String[] csvDados = dados.split("\n");
		this.report.generateReport(csvDados);
		
	}

}
