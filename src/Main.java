import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hienThiMang(daoNguocMang(nhapGiaTriPhanTu(nhapSizeMang())));
    }

    static int nhapSizeMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Mang khong duoc qua 20. Nhap lai !!!");
            nhapSizeMang();
        } else {
            System.out.println("Mang co " + size + " phan tu");
        }
        return size;
    }

    static int[] nhapGiaTriPhanTu(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] monkey = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + " la : ");
            monkey[i] = scanner.nextInt();
        }
        return monkey;
    }

    static int[] hienThiMang(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println("]");
        return arr;
    }

    static int[] daoNguocMang(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }
}
