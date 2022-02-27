package de7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GiangVien extends NhanVien{
    private String maGV;
    private String diaChi;
    private String gioiTinh;
    private String khoa;
    
    public GiangVien(int id, String maGV, String diaChi, String gioiTinh, String khoa, String hoten) {
        super(id, hoten);
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    public void writeToFile(GiangVien gv) throws IOException{
        File f = new File("giangvien.dat");
        FileWriter fw = new FileWriter(f, true);
        fw.write(gv.toString());
        fw.close();
    }

    @Override
    public String toString() {
        return Integer.toString(this.getId()) + "$" + this.getHoten() + "$" + maGV + "$" + 
                diaChi + "$" + gioiTinh + "$" + khoa + "\n";
    }
    
    
}
