import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("So nguyen to trong day la: ");
        for (int i = 0; i < n; i++) {
            if (SoNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Tong so cac so nguyen to trong day la: " + sum);
    }

    public static boolean SoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i < (n - 1); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
