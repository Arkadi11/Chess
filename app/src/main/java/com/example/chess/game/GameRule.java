package com.example.chess.game;

public class GameRule {
    public boolean isValidPlace(Position position) {
        if (position.getHorz() >= Constants.MIN_HORZ && position.getHorz() <= Constants.MAX_HORZ
                && (position.getVert().charAt(0) >= Constants.MIN_VERT.charAt(0) && position.getVert().charAt(0) >= Constants.MAX_VERT.charAt(0))) {
            return true;
        }
        return false;
    }
}


