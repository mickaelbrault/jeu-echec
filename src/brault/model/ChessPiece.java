package brault.model;


public class ChessPiece{
	
	private String id;
	private Integer row;
	private Integer column;
	private int team;
	
	/**
	 * @param name
	 * @param picture
	 * @param team => 1 pour les noirs et 2 pour les blancs
	 */
	public ChessPiece(String id, Integer row, Integer column, int team) {
		this.id = id;
		this.row = row;
		this.column = column;
		this.team = team;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	
}
