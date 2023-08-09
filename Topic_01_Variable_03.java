package javaTester;

public class Topic_01_Variable_03 {
    // Biến toàn cục
    static int globalVariable = 10;
    static final int MAX_VALUE = 100;


    // Hằng số
    public static void displayGlobalVariable() {
        // Truy cập và sử dụng biến toàn cục
        System.out.println("Giá trị biến toàn cục từ phương thức: " + globalVariable);
    }

    public static void main(String[] args) {

        System.out.println("Giá trị biến toàn cục: " + globalVariable);


        // Gọi phương thức sử dụng biến toàn cục
        displayGlobalVariable();

        System.out.println(MAX_VALUE);

    }



}
