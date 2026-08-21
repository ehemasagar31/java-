public class DefaultConstructor {
    int id;
    String name;

    // Default Constructor
    DefaultConstructor() {
        id = 101;
        name = "Mahi";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        obj.display();
    }
}