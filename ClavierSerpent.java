import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class ClavierSerpent extends KeyAdapter{
 	
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> direction a droit 
		    				//si n est pas la direction inverse
		    				if(Controller.directionSnake!=2) 
		    					Controller.directionSnake=1;
		    			  	break;
		    	case 38:	// -> direction vers le haut
							if(Controller.directionSnake!=4) 
								Controller.directionSnake=3;
		    				break;
		    				
		    	case 37: 	// -> direction a gauche
							if(Controller.directionSnake!=1)
								Controller.directionSnake=2;
		    				break;
		    				
		    	case 40:	// -> direction vers le bas
							if(Controller.directionSnake!=3)
								Controller.directionSnake=4;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
 	
 }
