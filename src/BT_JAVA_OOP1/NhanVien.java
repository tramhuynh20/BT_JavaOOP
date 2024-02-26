package BT_JAVA_OOP1;

public class NhanVien {
    public String name;
    public int age;
    public String gender;
    public String phone;
    public String address;

    public NhanVien(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public void showInfo(){
        System.out.println("Họ tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("Giới tính: "+gender);
        System.out.println("SĐT: "+phone);
        System.out.println("Địa chỉ: "+address);
    }
}
