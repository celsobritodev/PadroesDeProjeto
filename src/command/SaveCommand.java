package command;

import java.io.File;
import java.io.FileWriter;

public class SaveCommand implements Command {

	private File arquivo;
	private String content;
	
	public SaveCommand(String filename, String content) {
		try {
			arquivo = new File(filename);
			this.content = content;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void execute() {
		try {
			FileWriter writer = new FileWriter(arquivo);
			writer.write(content);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
