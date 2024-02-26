package BT_JAVA_OOP2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person(
                "Trâm",
                23,
                "Nữ",
                "0123459",
                "HCM"
        );

        person.showInfo();
    }
}
