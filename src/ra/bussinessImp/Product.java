package ra.bussinessImp;

import java.util.Scanner;

public class Product implements IProduct, Comparable<Product> {
    private int productid;
    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean productStatus;


    public Product() {
    }

    public Product(int productid, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, boolean productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getPrductid() {
        return productid;
    }

    public void setPrductid(int prducid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }


    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Id sản phẩm: ");
        this.productid = scanner.nextInt();
        scanner.nextLine(); // consume the \n after nextInt()
        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();
        System.out.print("Nhập tiêu đề sản phẩm: ");
        this.title = scanner.nextLine();
        System.out.print("Giá nhập: ");
        this.descriptions = scanner.nextLine();
        System.out.print("Giá xuất: ");
        this.importPrice = scanner.nextFloat();
        System.out.print("Nhập trạng thái (true/false): ");
        this.productStatus = scanner.nextBoolean();

        this.interest = this.exportPrice - this.importPrice;
    }

    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productid=" + productid +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +

                ", productStatus=" + productStatus +
                '}');
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.interest - o.getInterest());
    }
}
