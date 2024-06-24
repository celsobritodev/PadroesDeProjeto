package factory;

public class FabricaDeChefes extends FabricaDeFuncionarios {

	@Override
	public Calculable criarFuncionario() {
		return new Chefe("Chefe",10000.0,2000.0);
	}

}
