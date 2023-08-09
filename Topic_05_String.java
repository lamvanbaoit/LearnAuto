package javaTester;
public class Topic_05_String {

    public static void main(String[] args) {
//        Length();
//        CharAt();
//        SubString();
//        Concat();
//        IndexOf();
//        Equals();
//        EqualslgnoreCase();
//        ToLowerCase();
//        ToUpperCase();
//        Trim();
//        _With();
//        Replace();
//        Split1();
//        Split2();
        Split3();
        Split4();
        Split5();
        Convert1();
        Convert2();
        Convert3();
        Convert4();
        Convert5();
        Convert6();
    }

    public static void Length(){
        String str = "Hello, World!";
        int length = str.length();
        System.out.println(length);  // Kết quả: 13
    }

    public static void CharAt(){
        String str = "Hello, World!";
        char ch = str.charAt(7);
        System.out.println(ch);  // Kết quả: W
    }
    public static void SubString(){
        String str = "Hello, World!";
        String subStr = str.substring(7, 12);
        System.out.println(subStr);  // Kết quả: World
        String subStr2 = str.substring(1);
        System.out.println(subStr2);
    }

    public static void Concat(){
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2);
        System.out.println(result);  // Kết quả: HelloWorld
    }

    public static void IndexOf(){
        String str = "Hello, World!";
        int index = str.indexOf("World");
        System.out.println(index);  // Kết quả: 7
    }

    public static void Equals(){
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);
    }

    public static void EqualslgnoreCase(){
        String str1 = "Hello";
        String str2 = "hello";
        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println(result);
    }

    public static void ToLowerCase(){
        String str = "Hello, World!";
        String lowercase = str.toLowerCase();
        System.out.println(lowercase);  // Kết quả: hello, world!
    }

    public static void ToUpperCase(){
        String str = "Hello, World!";
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);  // Kết quả: HELLO, WORLD!
    }

    public static void Trim(){
        String str = "   Hello, World!   ";
        String trimmed = str.trim();
        System.out.println(trimmed);  // Kết quả: Hello, World!
    }

    public static void _With(){
        String str = "Hello, world!";
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("world");
        boolean containsComma = str.contains(",");
        System.out.println(startsWithHello);
        System.out.println(endsWithWorld);
        System.out.println(containsComma);
    }

    public static void Replace(){
        String str = "$12,34.5$";
        String replacedStr = str.replace("$", "@").replace(",", "-").replace(".", ",");
        System.out.println(replacedStr); // @12-34,5
    }

    public static void Split1(){
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void Split2(){
        String str = "Hello,World. Java!";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void Split3(){
        String str = "Hello   World   Java";
        String[] words = str.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void Split4(){
        String str = "Hello123World456Java789";
        String[] parts = str.split("\\d+");  // Chia chuỗi bởi các chữ số
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static void Split5(){
        String str = "Lam 72 of 1879 Van Bao";
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

    public static void Convert1(){
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }

    public static void Convert2(){
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str);
    }

    public static void Convert3(){
        String str = "3.14";
        double number = Double.parseDouble(str);
        System.out.println(number);
    }

    public static void Convert4(){
        double number = 3.14;
        String str = Double.toString(number);
        System.out.println(str);
    }

    public static void Convert5(){
        String str = "true";
        boolean value = Boolean.parseBoolean(str);
        System.out.println(value);
    }
    public static void Convert6(){
        boolean value = true;
        String str = Boolean.toString(value);
        System.out.println(str);
    }


}


