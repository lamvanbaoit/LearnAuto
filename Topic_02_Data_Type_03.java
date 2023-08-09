package javaTester;

public class Topic_02_Data_Type_03 {
    //Khai báo biến
    static int bienA = 1234;

    public static void main(String[] args) {
        //Ví dụ biến nguyên thủy
        int bienB = bienA;
        System.out.println("Trước khi thay đổi giá trị");
        System.out.println("Biến A: " + bienA);
        System.out.println("Biến B: " + bienB);
        bienB = 9876;
        System.out.println("Sau khi thay đổi giá trị");
        System.out.println("Biến A: " + bienA);
        System.out.println("Biến B: " + bienB);
        System.out.println("------------------------------------");
        //Ví dụ biến tham chiếu
        Topic_02_Data_Type_03 bienC = new Topic_02_Data_Type_03();
        Topic_02_Data_Type_03 bienD = bienC;
        System.out.println("Trước khi thay đổi giá trị");
        System.out.println("Biến C: " + bienC.bienA);
        System.out.println("Biến D: " + bienD.bienA);
        bienC.bienA = 1111;
        System.out.println("Sau khi thay đổi giá trị");
        System.out.println("Biến C: " + bienC.bienA);
        System.out.println("Biến D: " + bienD.bienA);
    }
}
