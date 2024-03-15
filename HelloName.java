package laptrinhhdt;
import java.util.Scanner;

class Nguoi {
    private String name;
    private int age;

    public Nguoi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class HelloName {
    public static void main(String[] args) {
    	String name ;
    	int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        age = sc.nextInt();
        sc.close();
    
        Nguoi person = new Nguoi(name, age);
        System.out.println("Thông tin của bạn:");
        System.out.println("Tên của bạn: " + person.getName());
        System.out.println("Tuổi của bạn: " + person.getAge());
    }
}


