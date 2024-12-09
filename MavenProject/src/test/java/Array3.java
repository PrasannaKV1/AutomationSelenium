import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N= sc.nextInt();
        int array[] =new int[N];
        for (int i = 0; i < array.length ; i++) {
            array[i]= sc.nextInt();
        }

        int evendigitsum =0,oddfigitsum =0, evensum=0,oddsum=0;
        for (int i = 0; i < array.length ; i++) {
             if (i%2==0)
             {
                 evensum+=array[i];
             }
             if(i%2!=0)
             {
                 oddsum+=array[i];
             }
             if(array[i]%2==0)
             {
                 evendigitsum+=array[i];
             }
             if(array[i]%2!=0)
             {
                 oddfigitsum+=array[i];
             }

        }
        System.out.println("evensum "+evensum +" oddsum"+oddsum +"evendigitsum"+evendigitsum+"odddigitsum"+oddfigitsum);
    }
}
