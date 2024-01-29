// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Address addressTom = new Address("RSA",27,"55 sol Ave ");
        User tom = new User("Tommie",23,addressTom);
        Admin terry = new Admin(true,"Terry",35,addressTom);

//        tom.display();
//        terry.display();
        terry.getAdmin();

    }
}