package com.example.chess.game;

public class Position {
    private String vert;
    private int horz;

    public Position(String vert, int horz) {
        this.vert = vert;
        this.horz = horz;
    }

    public String getVert() {
        return vert;
    }

    public void setVert(String vert) {
        this.vert = vert;
    }

    public int getHorz() {
        return horz;
    }

    public void setHorz(int horz) {
        this.horz = horz;
    }


}
