import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		//Création de la fenêtre avec toutes ses fonctionnalités de serpent
		Fenetre f1= new Fenetre();
		
		//Configurer les paramètres de la fenêtre
		f1.setTitle("Snake");
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
