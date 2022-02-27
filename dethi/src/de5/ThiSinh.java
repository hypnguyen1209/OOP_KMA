
package de5;

import java.util.Scanner;

public class ThiSinh {
    private String hoten;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoten, String ngaySinh, String diaChi) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoten = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = input.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = input.nextLine();
    }
    
    public void in(){
        System.out.printf("%-20s%-20s%-20s%", "Ho ten", "Ngay sinh", "Dia chi");
        System.out.printf("%-20s%-20s%-20s%", this.hoten, this.ngaySinh, this.diaChi);
    }
}
