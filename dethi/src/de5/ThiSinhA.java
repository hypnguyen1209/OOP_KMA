
package de5;

import java.util.Scanner;

public class ThiSinhA extends ThiSinh {

    private Float diemToan;
    private Float diemLy;
    private Float diemHoa;

    public ThiSinhA() {
    }

    public ThiSinhA(Float diemToan, Float diemLy, Float diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public ThiSinhA(Float diemToan, Float diemLy, Float diemHoa, String hoten, String ngaySinh, String diaChi) {
        super(hoten, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public Float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(Float diemToan) {
        this.diemToan = diemToan;
    }

    public Float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(Float diemLy) {
        this.diemLy = diemLy;
    }

    public Float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(Float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        super.nhap();
        try {
            System.out.println("Nhap diem mon toan:");
            do {
                diemToan = Float.parseFloat(input.nextLine());
                if (diemToan < 0 || diemToan > 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemToan < 0 || diemToan > 10);
            System.out.println("Nhap diem mon ly:");
            do {
                diemLy = Float.parseFloat(input.nextLine());
                if (diemLy < 0 || diemLy > 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemLy < 0 || diemLy > 10);
            System.out.println("Nhap diem mon hoa:");
            do {
                diemHoa = Float.parseFloat(input.nextLine());
                if (diemHoa < 0 || diemHoa> 10) {
                    System.out.println("Nhap sai so diem. Nhap lai: ");
                }
            } while (diemHoa < 0 || diemHoa > 10);
        } catch (Exception e) {
            System.out.println("So nhap khong hop le.");
        }
    }
    
    public ThiSinhA parseThiSinhA(Object o) {
        return (ThiSinhA) o;
    }

    public void in() {
//        System.out.println("Ho Ten: " +this.getHoten() +", Ngay sinh: "+ this.getNgaySinh() +", Dia chi: "+ this.getDiaChi()+
//                           "Diem toan: " +this.diemToan+ ", Diem ly: " +this.diemLy+ ", Diem hoa: " +this.diemHoa+ "\n");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "Ho Ten", "Ngay Sinh", "Dia Chi", "Diem Toan", "Diem Ly", "Diem Hoa");
        System.out.printf("%-20s%-20s%-20s%-20.2f%-20.2f%-20.2f\n",
                this.getHoten(), this.getNgaySinh(), this.getDiaChi(), this.diemToan, this.diemLy, this.diemHoa);
    }

    @Override
    public String toString() {
        return "diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + '\n';
    }

}
