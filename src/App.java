import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

public class App {

	public static void main(String[] args) {

		JFrame frame = new JFrame("FIAP FilmeS");
		JPanel content = new JPanel(new BorderLayout(20, 0));

		JPanel image = new JPanel();
		JPanel window = new JPanel(new GridLayout(0, 1, 0, 0));
		JPanel selection = new JPanel(new GridLayout(0, 1, 0, 0));
		selection.setPreferredSize(new Dimension(130, 400));

		JLabel imgBox = new JLabel(new ImageIcon("src/Filme.jpeg"));

		imgBox.setPreferredSize(new Dimension(200, 300));
		image.add(imgBox);

		lblDesign title = new lblDesign("Título");
		window.add(title);

		TextField titleBox = new TextField();
		window.add(titleBox);

		lblDesign sinopsesynopsis = new lblDesign("Sinopse");

		window.add(sinopsesynopsis);

		novaTextArea sinopsesBox = new novaTextArea();
		window.add(sinopsesBox);

		lblDesign gender = new lblDesign("Gênero");
		window.add(gender);

		String[] type_gender = { "Drama", "Comédia", "Ação", "Aventura", "Terror", "Documentário" };
		JComboBox genderSelection = new JComboBox<String>(type_gender);
		window.add(genderSelection);

		JButton btnSalvar = new JButton("Salvar");
		JButton btnCancelar = new JButton("Cancelar");

		JPanel painelBotao = new JPanel();
		painelBotao.add(btnSalvar);
		painelBotao.add(btnCancelar);
		window.add(painelBotao);

		lblDesign where = new lblDesign("Onde assistir");
		selection.add(where);

		List<String> listoptions = List.of("Netflix", "Prime Vídeo", "Pirate Bay");
		RadioGroup group = new RadioGroup(listoptions);
		selection.add(group);
		JCheckBox watched = new JCheckBox("Assistido");
		selection.add(watched);

		lblDesign assessment = new lblDesign("Nota");
		selection.add(assessment);
		StarRater grade = new StarRater(5);
		selection.add(grade);

		content.add(image, BorderLayout.WEST);
		content.add(window, BorderLayout.CENTER);
		content.add(selection, BorderLayout.EAST);

		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", content);
		abas.add("Lista", new JPanel());
		frame.add(abas);

		frame.setSize(600, 420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		grade.addStarListener(new StarRater.StarListener() {

			@Override
			public void handleSelection(int selection) {
				grade.setRating(selection);

			}
		});

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Filme Filme = new Filme(titleBox, grade, sinopsesBox, group, genderSelection, watched);
				Filme.printFilmeData();

			}
		});
	}

}
