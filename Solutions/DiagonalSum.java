import java.util.Scanner;

class DiagonalSum
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter dimension of the matrix:");
        int n=ob.nextInt();
        int[][]arr=new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=ob.nextInt();
            }
        }
        ob.close();
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int j=arr.length-1-i;
         if(i==j)
           sum += arr[i][j];
        else
           sum += arr[i][i]+arr[i][j];
        }
        System.out.println("The diagonal sum of this matrix is: "+sum);
    }
}
