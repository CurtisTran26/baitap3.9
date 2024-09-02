
package BaiTap;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExercise {
    public static ArrayList <Integer> EnterData (ArrayList<Integer> numbers){
        Scanner scanner =new Scanner(System.in);
        System.out.println("So luong phan tu cua mang: ");
        int size = scanner.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Numbers["+i+"]=");
            int value = scanner.nextInt();
            numbers.add(value);
        }
        return numbers;
        
    }
    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Numbers[]="+Arrays.toString(numbers.toArray()));
        
    }
    
    public static Integer findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("Khong du phan tu de tim so lon thu 2.");
            return null;
        }

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(numbers, Collections.reverseOrder());

        // Duyệt qua danh sách để tìm số lớn thứ hai khác biệt
        int max1 = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (!numbers.get(i).equals(max1)) {
                return numbers.get(i);
            }
        }

        System.out.println("Khong co so lon thu 2 khac biet.");
        return null;
        
    }
    public static void deleteOddNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove(); // Xóa phần tử lẻ
            }
        }
    }
}
