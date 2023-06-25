package com.example.chess.data;

import com.example.chess.game.ChessManBishop;
import com.example.chess.game.ChessManKing;
import com.example.chess.game.ChessManKnight;
import com.example.chess.game.ChessManPawn;
import com.example.chess.game.ChessManQueen;
import com.example.chess.game.ChessManRook;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static Repository repository;
    private boolean isNewGame = true;

    List<ChessManBishop> bishops = new ArrayList<>();
    List<ChessManQueen> queens = new ArrayList<>();
    List<ChessManKnight> knights = new ArrayList<>();
    List<ChessManRook> rooks = new ArrayList<>();
    List<ChessManKing> kings = new ArrayList<>();
    List<ChessManPawn> pawns = new ArrayList<>();

    private Repository() {
    }
    public static Repository newInstance(){
        if (repository == null){
            repository = new Repository();
        }
        return repository;
    }

    public boolean isNewGame() {
        return isNewGame;
    }

    public void setNewGame(boolean newGame) {
        isNewGame = newGame;
    }

    public List<ChessManBishop> getBishops() {
        return bishops;
    }

    public void setBishops(List<ChessManBishop> bishops) {
        this.bishops = bishops;
    }

    public List<ChessManQueen> getQueens() {
        return queens;
    }

    public void setQueens(List<ChessManQueen> queens) {
        this.queens = queens;
    }

    public List<ChessManKnight> getKnights() {
        return knights;
    }

    public void setKnights(List<ChessManKnight> knights) {
        this.knights = knights;
    }

    public List<ChessManRook> getRooks() {
        return rooks;
    }

    public void setRooks(List<ChessManRook> rooks) {
        this.rooks = rooks;
    }

    public List<ChessManKing> getKings() {
        return kings;
    }

    public void setKings(List<ChessManKing> kings) {
        this.kings = kings;
    }

    public List<ChessManPawn> getPawns() {
        return pawns;
    }

    public void setPawns(List<ChessManPawn> pawns) {
        this.pawns = pawns;
    }
}

