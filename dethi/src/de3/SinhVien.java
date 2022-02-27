/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;

/**
 *
 * @author admin
 */
public class SinhVien {
    protected String maSV;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected Float diemTB;

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, Float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
    
    public void hienThi() {
        System.out.println("Ma SV: " + this.maSV);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Diem TB: " + this.diemTB);

    }
}
