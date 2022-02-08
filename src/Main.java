public class Main {
    public static void main(String[] args) {
        Person adilet = new Person("Adilet", "Student");
        adilet.TOSTRING();
        adilet.eat();
        adilet.walk();
        adilet.learn();
        System.out.println();

        Programmer programmer = new Programmer("Azamat", "Programmer", "QSU");
        programmer.TOSTRING();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Aleks", "Dancer", "Weekend");
        dancer.TOSTRING();
        dancer.dancing();
        System.out.println();

        Signer signer = new Signer("Sypin", "Signer", "Monoir");
        signer.TOSTRING();
        signer.singing();
        signer.playGitar();
    }
}