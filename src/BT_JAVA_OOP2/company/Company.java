package BT_JAVA_OOP2.company;

import BT_JAVA_OOP2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person(
                "Trâm",
                23,
                "Nữ",
                "0123459",
                "HCM"
        );

        System.out.println("Họ tên: "+person.name);
        System.out.println("Tuổi: "+person.age);
        System.out.println("Giới tính: "+person.gender);
    }
}
