import java.awt.Color;
import javax.swing.JPanel;

public class PanneauCaree extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public PanneauCaree(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}
	
}

