package BT_JAVA_OOP2.person;

public class Person {
    public String name;
    public int age;
    public String gender;
    protected String phone;
    protected String address;

    public Person(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    protected void showInfo(){
        System.out.println("Họ tên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("Giới tính: "+gender);
        System.out.println("SĐT: "+phone);
        System.out.println("Địa chỉ: "+address);
    }
}
