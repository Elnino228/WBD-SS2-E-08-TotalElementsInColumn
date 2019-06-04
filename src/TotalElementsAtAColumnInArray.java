import java.util.Scanner;

public class TotalElementsAtAColumnInArray {
    public static void main(String[] args) {
        double[][] arr={
                {1.1,2.0,3.5,4.7,5.7},
                {1.1,2.0,3.5,4.7,5.7},
                {1.1,2.0,3.5,4.7,5.7},
                {1.1,2.0,3.5,4.7,5.7}
        };
        Scanner sc=new Scanner(System.in);
        //enter position column
        System.out.println("Enter position column that want calulate total: ");
        int col=sc.nextInt();
        double total=0;
        for (int i=0;i<arr.length;i++){
            total+=arr[i][col];
        }
        //print total
        System.out.println("Total of elements at a column in array: "+total);
    }
}
