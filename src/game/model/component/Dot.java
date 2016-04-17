package game.model.component;

import game.utilities.ViewSettings;

/**
 * Extends from {@code Skill}. <br/>
 * Abstract class that serves as a super class for all the damage over time attacks.
 * 
 * @author ZhaoWen
 * @see {@link Skill}
 *
 */
public abstract class Dot extends Skill {
	
	//****************************** Attributes ******************************
	
	private int damage;
	
	//****************************** Constructor ******************************
	
	/**
	 * Creates an damage over time attack. Currently void.
	 */
	public Dot(int damage, int range, ViewSettings viewSettings, int dot){
		super(damage, range, viewSettings);
		setDot(dot);
	}
	
	//************************** Getters and Setters **************************
	
	/**
	 * Gets the damage dealt over time.
	 * 
	 * @return damage dealt over time
	 */
	public int getDot() {
		return damage;
	}
	
	/**
	 * Sets the damage dealt over time.
	 * 
	 * @param dot
	 */
	private void setDot(int dot) {
		this.damage = dot;
	}
	
}
