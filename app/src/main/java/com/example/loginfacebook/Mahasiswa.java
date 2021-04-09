package com.example.loginfacebook;

public class Mahasiswa {
    private String nama, nim, nohp, email, hobi;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Mahasiswa(String nama, String nim, String nohp, String email, String hobi) {
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;
        this.email = email;
        this.hobi = hobi;
    }
    public void setHobi(String hobi) {
        this.hobi = hobi;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getHobi() {
        return hobi;
    }
}