import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    static int size;
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        int choice = 0;
        Scanner input = new Scanner(System.in);
        boolean formInput = false;
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm:  \n" +
                    "2. Hiển thị thông tin các sản phẩm: \n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần: \n" +
                    "4. Xóa sản phẩm theo mã sản phẩm: \n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm: \n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm: \n" +
                    "7. Thoát");
            System.out.println("Nhập sự lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sản phẩm: ");
                    size = input.nextInt();
                    for (int i = 0; i < size; i++) {
                        System.out.println("+ Nhập thông tin sản phẩm thứ " + (i + 1));
                        products.add(new Product());
                        products.get(i).inputData();
                    }
                    formInput = true;
                    break;
                case 2:
                    for (int i = 0; i < products.size(); i++) {
                        products.get(i).displayData();
                    }
                    break;
                case 3:
                    System.out.println("Mảng sau khi sắp xếp sản phẩm theo lợi nhuận tăng dần là: ");
                    Collections.sort(products);
                    break;
                case 4:
                    System.out.println("Nhập sản phẩm cần xóa:");
                    int removeId = input.nextInt();
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).getPrductid() == removeId) {
                            products.remove(i);
                        }
                    }
                    for (int i = 0; i < products.size(); i++) {
                        products.get(i).displayData();
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Nhập sản phẩm cần tìm kiếm:");
                    String findProductName = input.nextLine();
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).getProductName().contains(findProductName)) {
                            products.get(i).displayData();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập mã sản phẩm cần thay đổi :");
                    int changeStatus = input.nextInt();
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).getPrductid() == changeStatus) {
                            System.out.println("Sản phẩm sau khi thay đổi trạng thái là : ");
                            products.get(i).displayData();
                            boolean check = products.get(i).isProductStatus();
                            if (check) {
                                products.get(i).setProductStatus(false);
                            } else
                                products.get(i).setProductStatus(true);
                            System.out.println("Sản phẩm sau khi thay đổi là");
                            products.get(i).displayData();
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mời bạn nhập lại lựa chọn từ (1-7)");
            }
        } while (choice != 0);
    }
}