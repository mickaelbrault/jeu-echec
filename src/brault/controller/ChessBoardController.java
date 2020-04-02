package brault.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import brault.model.ChessPiece;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ChessBoardController implements Initializable {
	
	private double WIDTH = 100.0;
	private double HEIGHT = 100.0;

	private ArrayList<ChessPiece> listChessPiece = new ArrayList<>();

	/**
	 * Plateau
	 */
	@FXML
	private AnchorPane chessBoardAnchor;
	@FXML
	private GridPane chessBoard;
	@FXML
	private Pane chessCaseMove = new Pane();
	@FXML
	private ChessPiece chessPiece;

	/**
	 * Case du plateau
	 */
	@FXML
	private Pane a1, a2, a3, a4, a5, a6, a7, a8;
	@FXML
	private Pane b1, b2, b3, b4, b5, b6, b7, b8;
	@FXML
	private Pane c1, c2, c3, c4, c5, c6, c7, c8;
	@FXML
	private Pane d1, d2, d3, d4, d5, d6, d7, d8;
	@FXML
	private Pane e1, e2, e3, e4, e5, e6, e7, e8;
	@FXML
	private Pane f1, f2, f3, f4, f5, f6, f7, f8;
	@FXML
	private Pane g1, g2, g3, g4, g5, g6, g7, g8;
	@FXML
	private Pane h1, h2, h3, h4, h5, h6, h7, h8;

	/*
	 * Pièce de l'échiquier
	 */
	@FXML
	private ImageView rook1, rook2, rook3, rook4;
	@FXML
	private ImageView knight1, knight2, knight3, knight4;
	@FXML
	private ImageView bishop1, bishop2, bishop3, bishop4;
	@FXML
	private ImageView pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8, pawn9, pawn10, pawn11, pawn12, pawn13, pawn14,
			pawn15, pawn16;
	@FXML
	private ImageView queen1, queen2;
	@FXML
	private ImageView king1, king2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		listChessPiece = initAllChessPiece();
		
		chessBoardAnchor.setOnMousePressed(new EventHandler <MouseEvent>()
		{
		    public void handle(MouseEvent event)
		    {
		    	System.out.println(listChessPiece);
		    	movePiece(listChessPiece, event);
		    }
		});
	}

	private ArrayList<ChessPiece> initAllChessPiece() {

		ArrayList<ChessPiece> listPiece = new ArrayList<>();

		// Noir
		
		ChessPiece rook1 = new ChessPiece(a1.getId(), a1.getLayoutX(), a1.getLayoutY());
		listPiece.add(rook1);
		ChessPiece knight1 = new ChessPiece(b1.getId(), b1.getLayoutX(), b1.getLayoutY());
		listPiece.add(knight1);
		ChessPiece bishop1 = new ChessPiece(c1.getId(), c1.getLayoutX(), c1.getLayoutY());
		listPiece.add(bishop1);
		ChessPiece king1 = new ChessPiece(d1.getId(), d1.getLayoutX(), d1.getLayoutY());
		listPiece.add(king1);
		ChessPiece queen1 = new ChessPiece(e1.getId(), e1.getLayoutX(), e1.getLayoutY());
		listPiece.add(queen1);
		ChessPiece bishop2 = new ChessPiece(f1.getId(), f1.getLayoutX(), f1.getLayoutY());
		listPiece.add(bishop2);
		ChessPiece knight2 = new ChessPiece(g1.getId(), g1.getLayoutX(), g1.getLayoutY());
		listPiece.add(knight2);
		ChessPiece rook2 = new ChessPiece(h1.getId(), h1.getLayoutX(), h1.getLayoutY());
		listPiece.add(rook2);
		ChessPiece pawn1 = new ChessPiece(a2.getId(), a2.getLayoutX(), a2.getLayoutY());
		listPiece.add(pawn1);
		ChessPiece pawn2 = new ChessPiece(b2.getId(), b2.getLayoutX(), b2.getLayoutY());
		listPiece.add(pawn2);

		return listPiece;

	}
	


	private void movePiece(ArrayList<ChessPiece> listChessPiece, MouseEvent event) {

		

		for (ChessPiece chessPieces : listChessPiece) {
			if (event.getSceneX() >= chessPieces.getLocationX() && event.getSceneX() <= (chessPieces.getLocationX() + WIDTH)
					&& event.getSceneY() >= chessPieces.getLocationY()
					&& event.getSceneY() <= (chessPieces.getLocationY() + HEIGHT)) {
				
				ImageView img = moveChessCase(chessPieces);
				chessCaseMove.setLayoutX(event.getSceneX());
				chessCaseMove.setLayoutY(event.getSceneY());
				chessCaseMove.getChildren().add(img);


				chessPiece = new ChessPiece(chessPieces.getId(), chessPieces.getLocationX(), chessPieces.getLocationY());
			}
		}
		System.out.println("PRESSER " + event.getSceneX() + " " + event.getSceneY());
		chessCaseMove.setMouseTransparent(false);
		event.setDragDetect(true);
		
		
		
		
		chessCaseMove.setOnMousePressed(new EventHandler <MouseEvent>()
		{
		    public void handle(MouseEvent event)
		    {
		    	chessCaseMove.setMouseTransparent(true);
		        System.out.println(chessCaseMove.getId() + " " + chessCaseMove.getLayoutX() + " " + chessCaseMove.getLayoutY());
		        event.setDragDetect(true);
		    }
		});
		 
		chessCaseMove.setOnMouseReleased(new EventHandler <MouseEvent>() 
		{
		    public void handle(MouseEvent event) 
		    {
		    	chessCaseMove.setMouseTransparent(false);
		    	chessCaseMove.setLayoutX(event.getSceneX());
				chessCaseMove.setLayoutY(event.getSceneY());
				chessPiece.setLocationX(event.getSceneX());
				chessPiece.setLocationX(event.getSceneY());
		        System.out.println(chessCaseMove.getId() + " " + chessCaseMove.getLayoutX() + " " + chessCaseMove.getLayoutY());
		        chessCaseMove = null;
		        chessPiece = null;
		    }
		});
		
	}

	private ImageView moveChessCase(ChessPiece chessPiece) {

		switch (chessPiece.getId()) {
		case "a1":
			return rook1;
		case "b1":
			return knight1;
		case "c1":
			return bishop1;
		case "d1":
			return king1;
		case "e1":
			return queen1;
		case "f1":
			return bishop2;
		case "g1":
			return knight2;
		case "h1":
			return rook2;
		default:
			return null;
		}
		
		
	}

}
