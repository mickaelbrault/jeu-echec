package brault.model;


public class ChessPiece{
	
	private String id;
	private String name;
	private String picture;
	
	/**
	 * @param name
	 * @param picture
	 */
	public ChessPiece(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
}
