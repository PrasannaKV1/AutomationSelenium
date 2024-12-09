import java.util.Scanner;

public class Arraysum1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of the array ");
        int N=sc.nextInt();
        int array[]=new int[N];

        for (int i = 0; i < array.length;i++) {
            array[i]= sc.nextInt();

        }
        int sum=0;
        for(int z = 0; z <array.length ; z++) {
            sum+=array[z];

        }
        System.out.println(sum);



    }
}
