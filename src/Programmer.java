public class Programmer extends Person {
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public void coding() {
        System.out.println(name + " вечером занимается программированием в компании:"+companyName);
    }

    @Override
    public String toString() {
    return "Имя:"+name+" Название компании:"+companyName+" Роль:"+designation;
}
}