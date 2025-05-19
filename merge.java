import java.util.*;
class merge {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int a[] = new int[4];
 int b[] = new int[3];
 int c[] = new int[7];
 System.out.println("Enter 4 elements for the first array:");
 for (int i = 0; i < a.length; i++) {
 a[i] = sc.nextInt();
 }


System.out.println("Enter 3 elements for the second array:");
 for (int j = 0; j < b.length; j++) {
 b[j] = sc.nextInt();
 }
 int i = 0, j = 0, k = 0;
 while (i < a.length && j < b.length) {
 if (a[i] < b[j]) {
 c[k++] = a[i++];
 } else {
 c[k++] = b[j++];
 }
 }
 while (i < a.length) {
 c[k++] = a[i++];
 }
 while (j < b.length) {
 c[k++] = b[j++];
 }
 System.out.println("Merged array:");
 for (int x : c) {
 System.out.print(x + "\t");
 }
 
 }
}