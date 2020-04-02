package brault.model;


public class ChessPiece{
	
	private String id;
	private String name;
	private String picture;
	private double locationX;
	private double locationY;
	
	/**
	 * @param name
	 * @param picture
	 */
	public ChessPiece(String id, double locationX, double locationY) {
		this.id = id;
		this.locationX = locationX;
		this.locationY = locationY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public double getLocationX() {
		return locationX;
	}

	public void setLocationX(double locationX) {
		this.locationX = locationX;
	}

	public double getLocationY() {
		return locationY;
	}

	public void setLocationY(double locationY) {
		this.locationY = locationY;
	}
	
	
}
