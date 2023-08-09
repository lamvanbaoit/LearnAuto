package javaTester;

public class NhanVien {
    private String ten;
    private int tuoi;

    // Các phương thức getter và setter để truy cập và cập nhật thông tin
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void lamViec() {
        System.out.println("Nhan vien dang lam viec...");
    }
}

