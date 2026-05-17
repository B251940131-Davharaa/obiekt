package lb6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Хийх үйлдэлээ сонгоно уу. (+,-,*):");
        String operator = sc.next();

       
        System.out.println("Эхний матрицийн хэмжээг оруулна уу:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        System.out.println("Эхний матрицад утга оруулна уу: Хэмжээ (" + r1 + "x" + c1 + ")");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

      
        int r2, c2;
        while (true) {
            System.out.println("Хоёр дахь матрицийн хэмжээг оруулна уу:");
            r2 = sc.nextInt();
            c2 = sc.nextInt();

           
            if (operator.equals("+") || operator.equals("-")) {
                if (r1 == r2 && c1 == c2) break;
                else System.out.println("Алдаа: Үйлдлүүд +/- заавал үүнтэй адилхан байх ёстой!");
            } else if (operator.equals("*")) {
                if (c1 == r2) break;
                else System.out.println("Алдаа:  *, Эхний матриц болон хоёр дахь матрицийн хэмжээ адилхан байх ёстой!");
            }
        }

       
        int[][] m2 = new int[r2][c2];
        System.out.println("Хоёр дахь матрицийн хэмжээг оруулна уу: Size (" + r2 + "x" + c2 + ")");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

       
        matrix myCalc = new matrix(m1, m2, operator);
        myCalc.calculateAndPrint();

        sc.close();
    }
}