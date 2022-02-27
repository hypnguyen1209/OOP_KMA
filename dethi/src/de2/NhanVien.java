/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

/**
 *
 * @author admin
 */
public class NhanVien extends Person {
    protected String phongBan;
    protected Float heSoLuong;
    protected int thamNien;
    protected Float luong;

    public String getPhongBan() {
        return phongBan;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public Float getLuong() {
        return luong;
    }

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
    
    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, Float heSoLuong, int thamNien, Float luong) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luong = luong;
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Phong ban: " + this.phongBan);
        System.out.println("He so luong: " + this.heSoLuong);
        System.out.println("Tham nien: " + this.thamNien);
        System.out.println("Luong: " + this.luong);
    }
    
    public Float luongTL() {
        return this.getLuong() * this.getHeSoLuong() * (1 + this.getThamNien()/ 100);
    }
}
