import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


class Fenetre extends JFrame{
	private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<DataCarre>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Fenetre(){
		
		
		// Crée l'arraylist qui contiendra les threads
		Grid = new ArrayList<ArrayList<DataCarre>>();
		ArrayList<DataCarre> data;
		
		//  Crée Threads et ses données et l'ajoute à l'arrayList
		for(int i=0;i<width;i++){
			data= new ArrayList<DataCarre>();
			for(int j=0;j<height;j++){
				DataCarre c = new DataCarre(2);
				data.add(c);
			}
			Grid.add(data);
		}
		
		// Mise en place de la disposition du panneau
		getContentPane().setLayout(new GridLayout(20,20,0,0));
		
		// Démarrer et mettre en pause tous les fils, puis ajouter chaque carré de chaque fil au panneau
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				getContentPane().add(Grid.get(i).get(j).square);
			}
		}
		
		//  position initiale du serpent
		Tuple position = new Tuple(10,10);
		// passer cette valeur au controlleur
		Controller c = new Controller(position);
		// jouer.
		c.start();

		// relier fenetre avec clavier
		this.addKeyListener((KeyListener) new ClavierSerpent());

		
		
	}
}
