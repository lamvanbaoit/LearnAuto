package javaTester;

public class Topic_02_Compare {
    int number = 8;
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        System.out.println(x);
        System.out.println(y);

        y = 10;
        System.out.println(x);
        System.out.println(y);

        Topic_02_Compare first = new Topic_02_Compare();
        Topic_02_Compare second = first;

        System.out.println(first.number);
        System.out.println(second.number);

        second.number = 15;
        System.out.println(first.number);
        System.out.println(second.number);

        int a = 10;
        int b = 20;
        int add = a + b;
        System.out.println(add);
    }
}
