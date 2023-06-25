package com.example.chess.game;

import java.util.List;

public class ChessManKnight implements MoveChessMan{
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
        return null;
    }
}
