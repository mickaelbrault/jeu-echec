package brault.controller;

import java.net.URL;
import java.util.ResourceBundle;

import brault.model.ChessPiece;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class ChessBoardController implements Initializable{
	
	
	/**
	 * Plateau
	 */
	@FXML
	private Pane chessBoard;
	
	
	/**
	 * Case du plateau
	 */
	@FXML
	private Pane a1 , a2 , a3, a4 , a5 , a6 , a7 , a8;
	@FXML
	private Pane b1 , b2 , b3, b4 , b5 , b6 , b7 , b8;
	@FXML
	private Pane c1 , c2 , c3, c4 , c5 , c6 , c7 , c8;
	@FXML
	private Pane d1 , d2 , d3, d4 , d5 , d6 , d7 , d8;
	@FXML
	private Pane e1 , e2 , e3, e4 , e5 , e6 , e7 , e8;
	@FXML
	private Pane f1 , f2 , f3, f4 , f5 , f6 , f7 , f8;
	@FXML
	private Pane g1 , g2 , g3, g4 , g5 , g6 , g7 , g8;
	@FXML
	private Pane h1 , h2 , h3, h4 , h5 , h6 , h7 , h8;
	
	/*
	 * Pièce de l'échiquier
	 */
	@FXML
	private Pane tower1;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		initChessPiece(a1);
		
	}
	
	private void initChessPiece(Pane chessCase) {
		ChessPiece chessPiece = new ChessPiece(chessCase.getId());
		
	    movePiece(chessPiece, chessCase);
	}
	
	
	
	private void movePiece(ChessPiece chessPiece, Pane chessCase) {
		
		
		
		
		
	}
	
	
	
	
	
	

	
}
