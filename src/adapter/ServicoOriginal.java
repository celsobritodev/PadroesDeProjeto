package adapter;

public class ServicoOriginal implements IRelatorio {

	@Override
	public void gerarRelatorio(String dados) {
		System.out.println("Relatório Modulo Original");
		System.out.println("-------------------------");
		System.out.println(dados);
		System.out.println("-------------------------");
		
		
	}

}
