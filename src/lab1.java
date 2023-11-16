import java.util.Scanner;

public class lab1 {
    public static void sort(int[] numbers){
        int temp;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j< numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("จำนวนตัวเลข : ");
        int number = s.nextInt();
        int[] num = new int [number];

        for(int i=0;i<number;i++){
            System.out.print("เลขที่"+(i+1)+": ");
            num[i] = s.nextInt();
        }

        System.out.println("เรียงเลขจากน้อยไปมาก : ");
        sort(num);
    }
}