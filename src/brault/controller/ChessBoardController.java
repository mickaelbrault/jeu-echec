package brault.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import brault.model.ChessPiece;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ChessBoardController implements Initializable {

	private ArrayList<ChessPiece> listChessPiece = new ArrayList<>();

	/**
	 * Plateau
	 */
	@FXML
	private AnchorPane chessBoardAnchor;
	@FXML
	private GridPane chessBoard;
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
	private ImageView pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8, pawn9, pawn10, pawn11, pawn12, pawn13,
			pawn14, pawn15, pawn16;
	@FXML
	private ImageView queen1, queen2;
	@FXML
	private ImageView king1, king2;

	// Pièce sélectionné
	private Pane chessPieceSelect;
	private Pane chessCaseSelect;
	private boolean chessPieceIsSelected;
	private ImageView chessImgSelect;
	private Node source1;
	private Node source2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		initAllChessPiece();
	}

	@FXML
	private void selectPane(MouseEvent e) {
		
		if (chessPieceIsSelected == false) {
			source1 = (Node) e.getSource();
			
			chessPieceSelect = (Pane) source1;
			
			if(!chessPieceSelect.getChildren().isEmpty()) {
				chessPieceIsSelected = true;
			} else {
				System.out.println("La case est vide");
			}
			
		} else {
			
			source2 = (Node) e.getSource();
			
			for (ChessPiece chessPiece : listChessPiece) {
				
				if(GridPane.getColumnIndex(source1) == chessPiece.getColumn() && GridPane.getRowIndex(source1) == chessPiece.getRow()) {
					chessCaseSelect = (Pane) source2;
					System.out.println(chessCaseSelect);
					System.out.println("Selection 2 => " + chessCaseSelect.getChildren());
					
					// rencontre de pièce vérifier dans quel team est la pièce
					
					if(!chessCaseSelect.getChildren().isEmpty()) {
						
						System.out.println("Ya du monde");
					} else {
						chessPiece.setColumn(GridPane.getColumnIndex(source2));
						chessPiece.setRow(GridPane.getRowIndex(source2));
						
						chessImgSelect = choicePieceToMove(chessPiece);
						chessCaseSelect.getChildren().add(chessImgSelect);
						
					}
				}
			}
			
			chessPieceIsSelected = false;
		}
	}
	
	
	/*
	 * Initialisation des pièces d'echec
	 */
	private void initAllChessPiece() {

		// Noir
		ChessPiece rook1 = new ChessPiece("rook1", GridPane.getRowIndex(a1), GridPane.getColumnIndex(a1),1);
		listChessPiece.add(rook1);
		ChessPiece knight1 = new ChessPiece("knight1", GridPane.getRowIndex(b1), GridPane.getColumnIndex(b1),1);
		listChessPiece.add(knight1);
		ChessPiece bishop1 = new ChessPiece("bishop1", GridPane.getRowIndex(c1), GridPane.getColumnIndex(c1),1);
		listChessPiece.add(bishop1);
		ChessPiece king1 = new ChessPiece("king1", GridPane.getRowIndex(e1), GridPane.getColumnIndex(e1),1);
		listChessPiece.add(king1);
		ChessPiece queen1 = new ChessPiece("queen1", GridPane.getRowIndex(d1), GridPane.getColumnIndex(d1),1);
		listChessPiece.add(queen1);
		ChessPiece bishop2 = new ChessPiece("bishop2", GridPane.getRowIndex(f1), GridPane.getColumnIndex(f1),1);
		listChessPiece.add(bishop2);
		ChessPiece knight2 = new ChessPiece("knight2", GridPane.getRowIndex(g1), GridPane.getColumnIndex(g1),1);
		listChessPiece.add(knight2);
		ChessPiece rook2 = new ChessPiece("rook2", GridPane.getRowIndex(h1), GridPane.getColumnIndex(h1),1);
		listChessPiece.add(rook2);
		ChessPiece pawn1 = new ChessPiece("pawn1", GridPane.getRowIndex(a2), GridPane.getColumnIndex(a2),1);
		listChessPiece.add(pawn1);
		ChessPiece pawn2 = new ChessPiece("pawn2", GridPane.getRowIndex(b2), GridPane.getColumnIndex(b2),1);
		listChessPiece.add(pawn2);
		ChessPiece pawn3 = new ChessPiece("pawn3", GridPane.getRowIndex(c2), GridPane.getColumnIndex(c2),1);
		listChessPiece.add(pawn3);
		ChessPiece pawn4 = new ChessPiece("pawn4", GridPane.getRowIndex(d2), GridPane.getColumnIndex(d2),1);
		listChessPiece.add(pawn4);
		ChessPiece pawn5 = new ChessPiece("pawn5", GridPane.getRowIndex(e2), GridPane.getColumnIndex(e2),1);
		listChessPiece.add(pawn5);
		ChessPiece pawn6 = new ChessPiece("pawn6", GridPane.getRowIndex(f2), GridPane.getColumnIndex(f2),1);
		listChessPiece.add(pawn6);
		ChessPiece pawn7 = new ChessPiece("pawn7", GridPane.getRowIndex(g2), GridPane.getColumnIndex(g2),1);
		listChessPiece.add(pawn7);
		ChessPiece pawn8 = new ChessPiece("pawn8", GridPane.getRowIndex(h2), GridPane.getColumnIndex(h2),1);
		listChessPiece.add(pawn8);
		
		
		// Blanc
		ChessPiece rook3 = new ChessPiece("rook3", GridPane.getRowIndex(a8), GridPane.getColumnIndex(a8),2);
		listChessPiece.add(rook3);
		ChessPiece knight3 = new ChessPiece("knight3", GridPane.getRowIndex(b8), GridPane.getColumnIndex(b8),2);
		listChessPiece.add(knight3);
		ChessPiece bishop3 = new ChessPiece("bishop3", GridPane.getRowIndex(c8), GridPane.getColumnIndex(c8),2);
		listChessPiece.add(bishop3);
		ChessPiece king2 = new ChessPiece("king2", GridPane.getRowIndex(e8), GridPane.getColumnIndex(e8),2);
		listChessPiece.add(king2);
		ChessPiece queen2 = new ChessPiece("queen2", GridPane.getRowIndex(d8), GridPane.getColumnIndex(d8),2);
		listChessPiece.add(queen2);
		ChessPiece bishop4 = new ChessPiece("bishop4", GridPane.getRowIndex(f8), GridPane.getColumnIndex(f8),2);
		listChessPiece.add(bishop4);
		ChessPiece knight4 = new ChessPiece("knight4", GridPane.getRowIndex(g8), GridPane.getColumnIndex(g8),2);
		listChessPiece.add(knight4);
		ChessPiece rook4 = new ChessPiece("rook4", GridPane.getRowIndex(h8), GridPane.getColumnIndex(h8),2);
		listChessPiece.add(rook4);
		ChessPiece pawn9 = new ChessPiece("pawn9", GridPane.getRowIndex(a7), GridPane.getColumnIndex(a7),2);
		listChessPiece.add(pawn9);
		ChessPiece pawn10 = new ChessPiece("pawn10", GridPane.getRowIndex(b7), GridPane.getColumnIndex(b7),2);
		listChessPiece.add(pawn10);
		ChessPiece pawn11 = new ChessPiece("pawn11", GridPane.getRowIndex(c7), GridPane.getColumnIndex(c7),2);
		listChessPiece.add(pawn11);
		ChessPiece pawn12 = new ChessPiece("pawn12", GridPane.getRowIndex(d7), GridPane.getColumnIndex(d7),2);
		listChessPiece.add(pawn12);
		ChessPiece pawn13 = new ChessPiece("pawn13", GridPane.getRowIndex(e7), GridPane.getColumnIndex(e7),2);
		listChessPiece.add(pawn13);
		ChessPiece pawn14 = new ChessPiece("pawn14", GridPane.getRowIndex(f7), GridPane.getColumnIndex(f7),2);
		listChessPiece.add(pawn14);
		ChessPiece pawn15 = new ChessPiece("pawn15", GridPane.getRowIndex(g7), GridPane.getColumnIndex(g7),2);
		listChessPiece.add(pawn15);
		ChessPiece pawn16 = new ChessPiece("pawn16", GridPane.getRowIndex(h7), GridPane.getColumnIndex(h7),2);
		listChessPiece.add(pawn16);
	}
	
	
	/**
	 * Choix de l'image à déplacer
	 */
	private ImageView choicePieceToMove(ChessPiece chessPiece) {
		
		switch (chessPiece.getId()) {
		case "rook1":
			return rook1;
		case "knight1":
			return knight1;
		case "bishop1":
			return bishop1;
		case "queen1":
			return queen1;
		case "king1":
			return king1;
		case "bishop2":
			return bishop2;
		case "knight2":
			return knight2;
		case "rook2":
			return rook2;
		case "pawn1":
			return pawn1;
		case "pawn2":
			return pawn2;
		case "pawn3":
			return pawn3;
		case "pawn4":
			return pawn4;
		case "pawn5":
			return pawn5;
		case "pawn6":
			return pawn6;
		case "pawn7":
			return pawn7;
		case "pawn8":
			return pawn8;
		case "rook3":
			return rook3;
		case "knight3":
			return knight3;
		case "bishop3":
			return bishop3;
		case "queen2":
			return queen2;
		case "king2":
			return king2;
		case "bishop4":
			return bishop4;
		case "knight4":
			return knight4;
		case "rook4":
			return rook4;
		case "pawn9":
			return pawn9;
		case "pawn10":
			return pawn10;
		case "pawn11":
			return pawn11;
		case "pawn12":
			return pawn12;
		case "pawn13":
			return pawn13;
		case "pawn14":
			return pawn14;
		case "pawn15":
			return pawn15;
		case "pawn16":
			return pawn16;
		default:
			break;
		}
		return null;
	}
	
}
