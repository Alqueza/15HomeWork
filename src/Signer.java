public class Signer extends Person {
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    String bandName;

    public Signer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;}
    public void singing() {
        System.out.println(name + " напевает мелодию с бандой:"+bandName);
    }

    public void playGitar() {
        System.out.println(name + " делает невероятный запил на гитаре!");
    }
}