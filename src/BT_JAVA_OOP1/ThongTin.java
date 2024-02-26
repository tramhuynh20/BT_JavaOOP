package BT_JAVA_OOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien(
                "Trâm",
                23,
                "Nữ",
                "0123459",
                "HCM"
        );

        nhanVien.showInfo();
    }
}
