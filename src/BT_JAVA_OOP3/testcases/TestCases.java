package BT_JAVA_OOP3.testcases;

import BT_JAVA_OOP3.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCRM(){
        System.out.println("Mở trình duyệt web và nhập URL https://cms.anhtester.com/login");
        System.out.println("Nhập email và pasword hợp lệ.");
        System.out.println("Nhấn vào nút Login để thực hiện đăng nhập.");
        System.out.println("Kiểm tra đã chuyển hướng đến được trang admin CMS.");
    }
    public void testLogin(){
        createDriver(); //Default = Chrome
        loginCRM();
        closeDriver();
    }

    public void testAddCategory(){
        createDriver("Edge");
        loginCRM();
        System.out.println("Nhấn menu Category đến trang list categories");
        System.out.println("Nhấn nút Add New Category");
        System.out.println("Nhập đầy đủ thông tin yêu cầu cho category");
        System.out.println("Nhấn nút Save");
        System.out.println("Kiểm tra category mới được thêm vào trang list categories");
        closeDriver("Edge");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("============================");
        testCases.testAddCategory();
    }
}
