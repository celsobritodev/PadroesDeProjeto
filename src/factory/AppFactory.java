package factory;
import java.util.ArrayList;
import java.util.List;

public class AppFactory {

	public static void doFactory() {
		
		List<Calculable> folhaPagto;
		
		folhaPagto = new ArrayList<Calculable>();
		
		FabricaDeFuncionarios fabricaChefes,fabricaHoristas;
		fabricaChefes = new FabricaDeChefes();
		fabricaHoristas = new FabricaDeHoristas();
		
		folhaPagto.add(fabricaChefes.criarFuncionario());
		folhaPagto.add(fabricaHoristas.criarFuncionario());
		folhaPagto.add(fabricaChefes.criarFuncionario());
		folhaPagto.add(fabricaHoristas.criarFuncionario());
		
		
		// o que vai ser o calculo efetivamente?
		for (Calculable c:folhaPagto) {
			System.out.println(c.toString()+c.calcularSalario());
		}
		
	}

}
