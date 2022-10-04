package reflectionAPI;

@Author(name = "Andrew", dateOfCreation = 2022)
public class Person {
    private int id;
    private String name;

    public Person(){
        this.id = -1;
        this.name = "No name";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Person with " + id + " and name " + " say Hello !!!");
    }
}
