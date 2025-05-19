import java.util.*;
class matrix_opr {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[][] matrix1 = new int[2][2], matrix2 = new int[2][2], result = new int[2][2];
System.out.println("Enter first 2x2 matrix:");
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
matrix1[i][j] = scanner.nextInt();
System.out.println("Enter second 2x2 matrix:");
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
matrix2[i][j] = scanner.nextInt();
System.out.println("Addition:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = matrix1[i][j] + matrix2[i][j];
System.out.print(result[i][j] + " ");
}
System.out.println();
}
System.out.println("Multiplication:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
System.out.print(result[i][j] + " ");
}

System.out.println();
}
System.out.println("Transpose of first matrix:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++)
System.out.print(matrix1[j][i] + " ");
System.out.println();
}
}
}
