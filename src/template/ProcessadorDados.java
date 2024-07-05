package template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public abstract class ProcessadorDados {

	protected List<String> data;
	protected File file;
	protected FileReader reader;
	protected List<Pessoa> result;
	
	public ProcessadorDados (String fileName) {
		
		try {
			file = new File(fileName);
			this.data = new ArrayList<String>();
			this.result = new ArrayList<Pessoa>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void processData() {
		step1();
		step2();
		step3();
		
	}
	
	public void step1() { // abrir o arquivo para leitura
		try {
			reader = new FileReader(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void step2() { // ler o arquivo todo e gravar na lista de strings
		try {
			BufferedReader br = new BufferedReader(reader);
			String line;
			while((line=br.readLine())!=null) {
			   this.data.add(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public abstract void step3(); // aqui vem a logica de conveter string formatada para objetos
	
	public void printResult() {
		for(Pessoa p:result) {
			System.out.println(p);
		}
		
	}
	
	
	
}
