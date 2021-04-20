import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Filme {

	public TextField txtTitulo;
	public StarRater rating;
	public novaTextArea sinopsesBox;
	public RadioGroup radioGroup;
	public JComboBox genderSelection;
	public JCheckBox watched;

	public Filme(TextField titleBox, StarRater rating, novaTextArea sinopsesBox, RadioGroup group,
			JComboBox genderSelection, JCheckBox watched) {
		this.txtTitulo = titleBox;
		this.rating = rating;
		this.sinopsesBox = sinopsesBox;
		this.radioGroup = group;
		this.genderSelection = genderSelection;
		this.watched = watched;
	}

	public void printFilmeData() {
		System.out.println(txtTitulo.getText());
		System.out.println("Nota " + rating.getRating());
		System.out.println("Sinopse:");
		System.out.println(sinopsesBox.getText());
		System.out.println("Está disponivel em: " + radioGroup.getValue());
		System.out.println("Genero: " + genderSelection.getSelectedItem());
		if (watched.isSelected()) {
			System.out.println("Foi assistido");
		} else {
			System.out.println("Não foi assistido");
		}
	}

}