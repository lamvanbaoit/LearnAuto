package javaTester;

import java.util.Scanner;

public class Topic_05_String_BT {
    public static void Ex01() {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        // Khởi tạo biến đếm
        int soLuongVietHoa = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            char kyTu = str.charAt(i);
            // Kiểm tra xem ký tự có phải là chữ cái viết hoa không
            if (Character.isUpperCase(kyTu)) {
                soLuongVietHoa++;
            }
        }

        // In ra kết quả
        System.out.println("Số lượng ký tự viết hoa trong chuỗi là: " + soLuongVietHoa);

        // Đóng đối tượng Scanner
        scanner.close();
    }

    public static void Ex02() {
        String chuoi = "Automation Testing 123 Tutorials Online 321";
        System.out.println("--------------------------------------");
        // Đếm số lượng ký tự 'a' trong chuỗi
        int soLuongA = countCharacter(chuoi, 'a');
        System.out.println("Số lượng ký tự 'a': " + soLuongA);

        // Kiểm tra chuỗi có chứa từ "Testing" hay không
        boolean containsTesting = checkSubstring(chuoi, "Testing");
        System.out.println("Chuỗi có chứa từ 'Testing': " + containsTesting);

        // Kiểm tra chuỗi bắt đầu từ "Automation" hay không
        boolean startsWithAutomation = checkStartsWith(chuoi, "Automation");
        System.out.println("Chuỗi bắt đầu từ 'Automation': " + startsWithAutomation);

        // Kiểm tra chuỗi có kết thúc bằng từ "Online" hay không
        boolean endsWithOnline = checkEndsWith(chuoi, "Online");
        System.out.println("Chuỗi kết thúc bằng từ 'Online': " + endsWithOnline);

        // Lấy vị trí của từ "Tutorials" trong chuỗi
        int positionTutorials = findSubstring(chuoi, "Tutorials");
        System.out.println("Vị trí của từ 'Tutorials': " + positionTutorials);

        // Thay thế từ "Online" bằng "Offline"
        String replacedString = replaceSubstring(chuoi, "Online", "Offline");
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);

        // Đếm số lượng ký tự là số trong chuỗi
        int soLuongSo = countNumericCharacters(chuoi);
        System.out.println("Số lượng ký tự số: " + soLuongSo);


    }

    // Phương thức đếm số lượng ký tự trong chuỗi
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // Phương thức kiểm tra chuỗi có chứa từ con hay không
    public static boolean checkSubstring(String str, String substring) {
        return str.contains(substring);
    }

    // Phương thức kiểm tra chuỗi bắt đầu từ từ con hay không
    public static boolean checkStartsWith(String str, String startsWith) {
        return str.startsWith(startsWith);
    }

    // Phương thức kiểm tra chuỗi có kết thúc bằng từ con hay không
    public static boolean checkEndsWith(String str, String endsWith) {
        return str.endsWith(endsWith);
    }

    // Phương thức tìm vị trí của từ con trong chuỗi
    public static int findSubstring(String str, String substring) {
        return str.indexOf(substring);
    }

    // Phương thức thay thế từ con trong chuỗi
    public static String replaceSubstring(String str, String oldSubstring, String newSubstring) {
        return str.replace(oldSubstring, newSubstring);
    }

    // Phương thức đếm số lượng ký tự số trong chuỗi
    public static int countNumericCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Ex01();
        Ex02();
    }
}
