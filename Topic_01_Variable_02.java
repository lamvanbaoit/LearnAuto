package javaTester;

public class Topic_01_Variable_02 {
    // biến toàn cục có giá trị mặc định
    // vì trong một hàm static thì biến cũng phải dùng static
    static int numberYear; // có giá trị mặc định

    // không dùng static thì mình khởi tạo rồi truy cập đến đó
    int numberMonth = 12;

    public static void displayLocalVariable() {
        // Khai báo và sử dụng biến cục bộ trong phương thức displayLocalVariable
        int localVariable = 10;
        System.out.println("Giá trị biến cục bộ từ phương thức: " + localVariable);
    }

    public static void main(String[] args) {
        // Khai báo và sử dụng biến cục bộ trong phương thức main
        // biến cục bộ ko có giá trị mặc định nên phải gán cho nó
        int localVariable = 5;
        System.out.println("Giá trị biến cục bộ: " + localVariable);

        // Gọi phương thức khác sử dụng biến cục bộ
        displayLocalVariable();

        System.out.println("Giá trị biến toàn cục: " + numberYear);

        // Gọi phương thức để truy cập biến toàn cục
        Topic_01_Variable_02 temp = new Topic_01_Variable_02();
        int number = temp.numberMonth;
        System.out.println("Giá trị biến toàn cục: " + number);

    }




}
