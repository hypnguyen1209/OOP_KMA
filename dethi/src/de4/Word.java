package de4;

public class Word {
    private int ID;
    private String En;
    private String Vn;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEn() {
        return En;
    }

    public void setEn(String En) {
        this.En = En;
    }

    public String getVn() {
        return Vn;
    }

    public void setVn(String Vn) {
        this.Vn = Vn;
    }

    public Word(int ID, String En, String Vn) {
        this.ID = ID;
        this.En = En;
        this.Vn = Vn;
    }

    public void show() {
        System.out.println("ID: " + this.getID() + "\t|\tEn: " + this.getEn() + "   \t|\tVn: " + this.getVn());
    }
}