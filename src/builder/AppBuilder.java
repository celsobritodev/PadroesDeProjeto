package builder;

public class AppBuilder {

	public static void doBuilder() {
		
		Carro c1,c2;
		
		CarroBuilder builder = new CarroBuilder();
		
		c1 = builder.definirMotor(new Motor("1.0 Flex Turbo"))
			.definirTransmissao(new Transmissao("Manual"))
		    .definirCor(new Cor("Prata"))
		    .build();
		
		c2 = builder.definirMotor(new Motor("2.0 Biturbo Diesel"))
				.definirTransmissao(new Transmissao("Automatica 10 velocidades"))
			    .definirCor(new Cor("Perolizado"))
			    .adicionarItemOpcional(new Opcional("Multimidia"))
			    .adicionarItemOpcional(new Opcional("Alarme"))
			    .adicionarItemOpcional(new Opcional("Bancos em couro"))
			    .build();
			
		System.out.println(c1);
		System.out.println(c2);

	}

}
