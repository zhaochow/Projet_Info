package game.model;

import java.util.Observable;

/**
 * Abstract class for any subclass that needs to be displayed. Subclasses need to define
 * an image URL and the limits (offsets, width and height).
 * 
 * @author ZhaoWen
 *
 */
public abstract class ViewableObject extends Observable implements Viewable {
	
	//****************************** Attributes ******************************
	
	private String imageURL;
	private int offsetX, offsetY, width, height;
	
	//****************************** Constructor ******************************
	
	/**
	 * Void Constructor
	 */
	public ViewableObject(){
		
	}
	
	//************************** Getters and Setters **************************
	
	@Override
	public String getImageURL() {
		return imageURL;
	}
	
	/**
	 * Sets the image URL.
	 * 
	 * @param imageURL
	 */
	protected void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	@Override
	public int getOffsetX() {
		return offsetX;
	}
	
	/**
	 * Sets the x offset of the image.
	 * 
	 * @param offsetX
	 */
	protected void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}
	
	@Override
	public int getOffsetY() {
		return offsetY;
	}
	
	/**
	 * Sets the y offset of the image.
	 * 
	 * @param offsetY
	 */
	protected void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of the image.
	 * 
	 * @param width
	 */
	protected void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of the image.
	 * 
	 * @param height
	 */
	protected void setHeight(int height) {
		this.height = height;
	}
	
}
