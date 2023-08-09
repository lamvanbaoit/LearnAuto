package javaTester;

public class Topic_02_Data_Type_02 {
    static int bienA = 1;//kieu du lieu nguyen thuy
    static int bienB = bienA;//kieu du lieu nguyen thuy

    static int[] thamChieu1 = {1,2,3};//kieu du lieu tham chieu

    static int[] thamChieu2 = thamChieu1;//kieu du lieu tham chieu

    public static void main(String[] args) {
        System.out.println("Bien A before = " + bienA);
        System.out.println("Bien B before = " + bienB);
        bienB = 2;
        bienA = 3;
        System.out.println("Bien A after = " + bienA);
        System.out.println("Bien B after = " + bienB);

        System.out.println("Phan tu dau tham chieu 1 before = " + thamChieu1[0]);
        System.out.println("Phan tu dau tham chieu 2 before = " + thamChieu2[0]);

        thamChieu1[0] = 100;
        System.out.println("Phan tu dau tham chieu 1 after = " + thamChieu1[0]);
        thamChieu2[0] = 111;
        System.out.println("Phan tu dau tham chieu 2 after = " + thamChieu2[0]);


    }
}
