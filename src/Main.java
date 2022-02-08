public class Main {
    public static void main(String[] args) {
        Person adilet = new Person("Adilet", "Student");
        System.out.println(adilet);
        adilet.eat();
        adilet.walk();
        adilet.learn();
        System.out.println();

        Programmer programmer = new Programmer("Azamat", "Programmer", "QSU");
        System.out.println(programmer);
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Aleks", "Dancer", "Weekend");
        System.out.println(dancer);
        dancer.dancing();
        System.out.println();

        Signer signer = new Signer("Sypin", "Signer", "Monoir");
        System.out.println(signer);
        signer.singing();
        signer.playGitar();
    }
}