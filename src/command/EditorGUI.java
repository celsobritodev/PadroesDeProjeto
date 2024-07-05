package command;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EditorGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JButton btnSalvar;
	JButton btnGravar;
	
	JTextArea areaDeTexto;
	JTextField nomeDoArquivo;
	
	Command cmdSalvar;
	
	
	public EditorGUI() {
		
		setTitle("Simple Editor");
		setLayout(null);
		setBounds(2000,100,640,480);
		setVisible(true);
		setLocationRelativeTo(null); // centraliza
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// botao salvar
		btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		btnSalvar.setBounds(10,10,100,50);
		getContentPane().add(btnSalvar);
		
		// botao gravar
		btnGravar = new JButton();
		btnGravar.setText("Gravar");
		btnGravar.setBounds(150,10,100,50);
		getContentPane().add(btnGravar);
		
		// caixa de edição
		nomeDoArquivo = new JTextField();
		nomeDoArquivo.setBounds(10,90,100,30);
		getContentPane().add(nomeDoArquivo);
		
		// caixa de texto
		areaDeTexto = new JTextArea();
		areaDeTexto.setBounds(10,150,400,200);
		areaDeTexto.setEnabled(true);
		getContentPane().add(areaDeTexto);
		
		setVisible(true);
		
		btnGravar.addActionListener( (e)-> {
			
			cmdSalvar = new SaveCommand(nomeDoArquivo.getText(),areaDeTexto.getText());
			cmdSalvar.execute();
		});
		
		btnSalvar.addActionListener( (e)-> {
			cmdSalvar = new SaveCommand(nomeDoArquivo.getText(),areaDeTexto.getText());
			cmdSalvar.execute();
		});
		
		
		
		
				
	}
	
}
