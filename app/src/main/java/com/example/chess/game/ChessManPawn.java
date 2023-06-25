package com.example.chess.game;

import com.example.chess.data.Repository;

import java.util.ArrayList;
import java.util.List;

public class ChessManPawn implements MoveChessMan {
    private Position position;
    private boolean isWhite;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    @Override
    public List<Position> motion(Position position) {
        List<Position> result = new ArrayList<>();
        if (position.getHorz() != 1 && position.getHorz() != 8) {
            if (isWhite) {
                result.add(new Position(position.getVert(), position.getHorz() + 1));
                if (position.getHorz() == 2) {
                    result.add(new Position(position.getVert(), position.getHorz() + 2));
                }
            } else {
                result.add(new Position(position.getVert(), position.getHorz() - 1));
                if (position.getHorz() == 7) {
                    result.add(new Position(position.getVert(), position.getHorz() - 2));
                }
            }
        }
        result.addAll(attack(position));
        return result;
    }

    public List<Position> attack(Position position) {
        List<Position> attack = new ArrayList<>();
        List<Position> lockedFigure = new ArrayList<>();
        List<Position> result = new ArrayList<>();
        if (isWhite) {
            attack.add(new Position("" + (position.getVert().charAt(0) + 1), position.getHorz() + 1));
            attack.add(new Position("" + (position.getVert().charAt(0) - 1), position.getHorz() + 1));
        } else {
            attack.add(new Position("" + (position.getVert().charAt(0) + 1), position.getHorz() - 1));
            attack.add(new Position("" + (position.getVert().charAt(0) - 1), position.getHorz() - 1));
        }
        Repository repository = Repository.newInstance();

        for (ChessManBishop chessManBishop : repository.getBishops()) {
            if (isWhite != chessManBishop.isWhite()) {
                lockedFigure.add(chessManBishop.getPosition());
            }
        }
        for (ChessManQueen chessManQueen : repository.getQueens()) {
            if (isWhite != chessManQueen.isWhite()) {
                lockedFigure.add(chessManQueen.getPosition());
            }
        }
        for (ChessManKnight chessManKnight : repository.getKnights()) {
            if (isWhite != chessManKnight.isWhite()) {
                lockedFigure.add(chessManKnight.getPosition());
            }
        }
        for (ChessManRook chessManRook : repository.getRooks()) {
            if (isWhite != chessManRook.isWhite()) {
                lockedFigure.add(chessManRook.getPosition());
            }
        }
        for (ChessManKing chessManKing : repository.getKings()) {
            if (isWhite != chessManKing.isWhite()) {
                lockedFigure.add(chessManKing.getPosition());
            }
        }
        for (ChessManPawn chessManPawn : repository.getPawns()) {
            if (isWhite != chessManPawn.isWhite()) {
                lockedFigure.add(chessManPawn.getPosition());
            }
        }
        for (Position attackPosition : attack) {
            if (lockedFigure.contains(attackPosition)) {
                result.add(attackPosition);
            }

        }
        return result;
    }
}



