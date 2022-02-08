public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " читает интересную книгу");
    }

    public void walk() {
        System.out.println(name + " гуляет на улице");
    }

    public void eat() {
        System.out.println(name + " кушает вкусное блюдо");
    }

    public void TOSTRING() {
        System.out.println("Имя:" + name + " Должность:" + designation);
    }

    @Override
    public String toString() {
        return "Имя:"+name+" Роль:"+designation;
}
}