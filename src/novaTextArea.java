import javax.swing.JTextArea;

public class novaTextArea extends JTextArea{

	private static final long serialVersionUID = 1L;
	
	private int linhas = 10;
	private int colunas = 20;
	
	public novaTextArea() {
		super();
		init();
	}

	private void init() {
		this.setRows(linhas);
		this.setColumns(colunas);
		this.setBorder(BorderFactory.criar());
	}

}