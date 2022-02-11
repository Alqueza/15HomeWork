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
    return "Имя:"+name+" Название компании:"+companyName+" Должность:"+designation;
}

    @Override
    public void learn() {
        System.out.println(name+" изучает программирование");
    }

    @Override
    public void walk() {
        System.out.println(name+" гуляет в парке");
    }

    @Override
    public void eat() {
        System.out.println(name+" ест прекрасный завтрак");
    }
}