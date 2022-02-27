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
public class SinhvienATTT extends SinhVien {
    protected Float hocPhi;

    public Float getHocPhi() {
        return hocPhi;
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

    public SinhvienATTT(String maSV, String hoTen, String ngaySinh, String gioiTinh, Float diemTB, Float hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }
    
    public void hienThi() {
        super.hienThi();
        System.out.println("Hoc phi: " + this.hocPhi);
    }
}
