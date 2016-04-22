package game.model.monster;

import game.model.Map;
import game.model.component.Stats;
import game.utilities.ImageDB;

/**
 * Extends from {@code Monster} <br/>
 * Red Dragon - enemy.
 * 
 * @author ZhaoWen
 * @see {@link Monster}
 *
 */
public class RedDragon extends Monster {
	
	//****************************** Attributes ******************************
	
	//****************************** Constructor ******************************
	
	/**
	 * Creates a red dragon and sets the map on which it is and its position.
	 * 
	 * @param map
	 * @param x
	 * @param y
	 * @see {@link Monster#Monster(Map)}
	 */
	public RedDragon(){
		super(ImageDB.getRedDragonView());
		setScope(2);
		setStats(new Stats(450, 100));
	}
	
	//************************** Getters and Setters **************************
	

	//******************************** Methods ********************************
	/*
	@Override
	public ViewSettings getImageSettings() {
		return imageSettings;
	}*/
	
	/**
	 * Defines the maximum of Hp this living being can have (depending on his level).
	 * 
	 * return maxHp
	 */
	/*private int maxHp(){
		return 300 + getLevel()*100;  
	}*/
}
