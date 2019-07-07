import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
//         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        nhap_mang(arr);
        
        System.out.print("\nMang vua nhap: ");
        xuat_mang(arr);
        
        System.out.println();
        xuat_SoNto(arr);
        
    }
    
    public static void nhap_mang(int[] arr) {
        for (int i = 0; i < arr.length(); i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = new Scanner(System.in).nextInt();
        }        
    }
    
    public static void xuat_mang(int[] arr) {
        for (int i = 0; i < arr.length(); i++) {          
             System.out.print(arr[i] + " ");                         
        }        
    }
    
    public static void xuat_SoNto(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length(); i++) {
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
