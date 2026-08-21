public class ParameterizedConstructor {
    int id;
    String name;

    // Parameterized Constructor
    ParameterizedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1 = new ParameterizedConstructor(101, "Mahi");
        ParameterizedConstructor s2 = new ParameterizedConstructor(102, "Rahul");

        s1.display();
        System.out.println();

        s2.display();
    }
}