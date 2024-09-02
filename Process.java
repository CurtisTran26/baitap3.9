
package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        ArrayList <Integer> numbers =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String check;
        do{
            System.out.println("Menu: Nhap data (phim 1),xuat data (phim 2),tim so lon thu 2 trong mang (phim 3),xoa so le trong mang (phim 4)");
            int choosion = Integer.parseInt(sc.nextLine());
            switch (choosion){
                case 1:
                    numbers = ArrayListExercise.EnterData(numbers);
                    break;
                case 2:
                    ArrayListExercise.DisplayData(numbers);
                    break;
                //tuong tu cho cac case khac
                case 3:
                    Integer max2 = ArrayListExercise.findMax2(numbers);
                    if (max2 != null) {
                        System.out.println("So lon thu 2 la: " + max2);
                    }
                    break;
                case 4:
                    ArrayListExercise.deleteOddNumbers(numbers);
                    System.out.println("Da xoa cac so le(nhan phim 2 de xem mang da xoa).");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!");
            }
            System.out.println("Nhap yes de tiep tuc chuong trinh ");
            check=sc.nextLine();
        }while (check.equals("yes"));
                
    }
}
