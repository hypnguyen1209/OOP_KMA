/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

/**
 *
 * @author admin
 */
public class Student extends Person {
    protected String maSV;
    protected String email;
    protected Float DTK;

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getEmail() {
        return email;
    }

    public Float getDTK() {
        return DTK;
    }

    public Student(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maSV, String email, Float DTK) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.DTK = DTK;
    }
    
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDTK(Float DTK) {
        this.DTK = DTK;
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Ma SV: " + this.maSV);
        System.out.println("Email: " + this.email);
        System.out.println("DTKL: " + this.DTK);
    }
}
