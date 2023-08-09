package javaTester;

public class NhanVienFullTime extends NhanVien {
    private double luong;

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void tinhLuong() {
        System.out.println("Luong cua nhan vien full-time: " + luong);
    }

    @Override
    public void lamViec() {
        System.out.println("Nhan vien full-time dang lam viec...");
    }
}