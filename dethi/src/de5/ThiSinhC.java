
package de5;

import java.util.Scanner;

/**
 *
 * @author Doan
 */
public class ThiSinhC extends ThiSinh {

    private Float diemVan;
    private Float diemSu;
    private Float diemDia;

    public ThiSinhC() {
    }

    public ThiSinhC(Float diemVan, Float diemSu, Float diemDia) {
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public ThiSinhC(Float diemVan, Float diemSu, Float diemDia, String hoten, String ngaySinh, String diaChi) {
        super(hoten, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public Float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(Float diemVan) {
        this.diemVan = diemVan;
    }

    public Float getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(Float diemSu) {
        this.diemSu = diemSu;
    }

    public Float getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(Float diemDia) {
        this.diemDia = diemDia;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        super.nhap();
        try {
            System.out.println("Nhap diem mon van:");
            do {
                diemVan = Float.parseFloat(input.nextLine());
                if (diemVan < 0 || diemVan > 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemVan < 0 || diemVan > 10);
            System.out.println("Nhap diem mon su:");
            do {
                diemSu = Float.parseFloat(input.nextLine());
                if (diemSu < 0 || diemSu > 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemSu < 0 || diemSu > 10);
            System.out.println("Nhap diem mon dia:");
            do {
                diemDia = Float.parseFloat(input.nextLine());
                if (diemDia < 0 || diemDia > 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemDia < 0 || diemDia > 10);
        } catch (Exception e) {
            System.out.println("So nhap khong hop le.");
        }
    }

    public ThiSinhC parseThiSinhC(Object o) {
        return (ThiSinhC) o;
    }

    public void in() {
//        System.out.println("Ho Ten: " + this.getHoten() + ", Ngay sinh: " + this.getNgaySinh() + ", Dia chi: " + this.getDiaChi()
//                + "Diem van: " + this.diemVan + ", Diem su: " + this.diemSu + ", Diem dia: " + this.diemDia + "\n");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "Ho Ten", "Ngay Sinh", "Dia Chi", "Diem Van", "Diem su", "Diem Dia");
        System.out.printf("%-20s%-20s%-20s%-20.2f%-20.2f%-20.2f\n",
                this.getHoten(), this.getNgaySinh(), this.getDiaChi(), this.getDiemVan(), this.getDiemSu(), this.getDiemDia());
    }

    @Override
    public String toString() {
        return "diemVan=" + diemVan + ", diemSu=" + diemSu + ", diemDia=" + diemDia + '\n';
    }

}
