import java.util.ArrayList;
import java.awt.Color;

public class DataCarre {

	
	//ArrayList qui contient les couleurs
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty 
	PanneauCaree square;
	public DataCarre(int col){
		
		//on ajoute les couleurs au tableau
		C.add(Color.darkGray);//0
		C.add(Color.BLUE);    //1
		C.add(Color.white);   //2
		color=col;
		square = new PanneauCaree(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
