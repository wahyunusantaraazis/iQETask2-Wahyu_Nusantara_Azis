package com.alterra;

public class User {
    String HP;
    String nama;

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        return "Halo Saya "+this.nama;
    }
}
