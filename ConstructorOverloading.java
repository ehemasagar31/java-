public class ConstructorOverloading {
    int id;
    String name;

    // Default Constructor
    ConstructorOverloading() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading(101, "Mahi");

        s1.display();
        System.out.println();

        s2.display();
    }
}