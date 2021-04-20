import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioGroup extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup group = new ButtonGroup();
	
	public String value;
	
	public String getValue() {
		return value;
	}

	private List<String> options;
	
	public RadioGroup(List<String> options) {
		this.options = options;
		this.value=options.get(0);
		init();
		 		
	}

	private void init() {
		options.forEach(option ->{
			JRadioButton listoptions = new JRadioButton(option); 
			listoptions.setPreferredSize(new Dimension(110,15));
			listoptions.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					value=option;
				}
			});
			group.add(listoptions);
			this.add(listoptions);
			
		});
	}
	

}