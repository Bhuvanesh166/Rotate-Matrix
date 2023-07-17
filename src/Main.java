
import java.util.Scanner;

class RotateMatrix{
    public void findRotateMatrix(int row ,int col ,int arr[][]) {
        int ar[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ar[i][j] = arr[j][i];
            }

        }
        for(int i=0;i<row;i++) {

            for (int j = row-1; j >=0; j--) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RotateMatrix  rotateMatrix=new  RotateMatrix();
        System.out.println("Enter no of row  :");
        int row= scanner.nextInt();
        System.out.println("Enter no of col  :");
        int col= scanner.nextInt();
        System.out.println("Enter array elements  :");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("MatrixRotation :");
        rotateMatrix.findRotateMatrix(row,col,arr);



    }

}
