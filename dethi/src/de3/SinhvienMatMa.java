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
public class SinhvienMatMa extends SinhVien {
    protected String donVi;
    protected Float luong;

    public String getDonVi() {
        return donVi;
    }

    public Float getLuong() {
        return luong;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Float getDiemTB() {
        return diemTB;
    }

    public SinhvienMatMa(String maSV, String hoTen, String ngaySinh, String gioiTinh, Float diemTB, String donVi, Float luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Don vi: " + this.donVi);
        System.out.println("Luong: " + this.luong);
    }
}
