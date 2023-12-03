public class Programming {
    String name;
    Programming(){
        System.out.println("Constructor Call");

        name = "Programmer";

    }

    public static void main(String[] args) {
        Programming ravihari = new Programming();
        System.out.println("Name is :- " + ravihari.name);
    }
}
