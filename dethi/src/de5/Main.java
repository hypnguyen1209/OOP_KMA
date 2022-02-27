package de5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("=============Menu=============");
            System.out.println("1.Nhap thi sinh khoi A.");
            System.out.println("2.Nhap thi sinh khoi C.");
            System.out.println("3.In danh sach.");
            System.out.println("4.In danh sach thi sinh co diem > 20.");
            System.out.println("0.Exit.");
            System.out.println("Chon: ");
            String choice;
            do {
                choice = input.nextLine();
                if (!choice.equals("1") && !choice.equals("2")
                        && !choice.equals("0") && !choice.equals("3")
                        && !choice.equals("4")) {
                    System.out.println("Chon sai. Chon lai: ");
                }
            } while (!choice.equals("1") && !choice.equals("2")
                    && !choice.equals("0") && !choice.equals("3")
                    && !choice.equals("4"));

            switch (choice) {
                case "1":
                    ThiSinhA tsa = new ThiSinhA();
                    tsa.nhap();
                    list.add(tsa);
                    break;
                case "2":
                    ThiSinhC tsc = new ThiSinhC();
                    tsc.nhap();
                    list.add(tsc);
                    break;
                case "3":
                    System.out.println("Thi sinh khoi A");
                    for (Object o : list) {
                        //get name class of object
                        String name = o.getClass().getSimpleName();
                        if (name.equalsIgnoreCase("ThiSinhA")) {
                            //parse object to ThiSinhA
                            ThiSinhA a = new ThiSinhA().parseThiSinhA(o);
                            a.in();
                        }
                    }
                    System.out.println("==============================================================================================================");
                    System.out.println("Thi sinh khoi C");
                    for (Object o : list) {
                        //get name class of object
                        String name = o.getClass().getSimpleName();
                        if (name.equalsIgnoreCase("ThiSinhC")) {
                            //parse object to ThiSinhA
                            ThiSinhC c = new ThiSinhC().parseThiSinhC(o);
                            c.in();
                        }
                    }
                    break;
                case "4":
                    System.out.println("Diem khoi A > 20");
                    for (Object o : list) {
                        //get name class of object
                        String name = o.getClass().getSimpleName();
                        if (name.equalsIgnoreCase("ThiSinhA")) {
                            //parse object to ThiSinhA
                            ThiSinhA a = new ThiSinhA().parseThiSinhA(o);
                            Float sum = a.getDiemToan() + a.getDiemLy() + a.getDiemHoa();
                            if (sum > 20L) {
                                a.in();
                            }
                        }
                    }
                    System.out.println("==============================================================================================================");
                    System.out.println("Diem khoi C > 20");
                    for (Object o : list) {
                        //get name class of object
                        String name = o.getClass().getSimpleName();
                        if (name.equalsIgnoreCase("ThiSinhC")) {
                            //parse object to ThiSinhC
                            ThiSinhC c = new ThiSinhC().parseThiSinhC(o);
                            Float sum = c.getDiemVan() + c.getDiemSu() + c.getDiemDia();
                            if (sum > 20L) {
                                c.in();
                            }
                        }
                    }
                    break;
                case "0":
                    System.exit(0);
                    break;
            }
        }
    }
}
