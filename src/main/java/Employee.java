public class  Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

public Employee(){}
public Employee(long id, String firstName, String lastName, String country, int age) {
    this.age=age;
    this.id=id;
    this.country=country;
    this.firstName=firstName;
    this.lastName=lastName;
}
@Override
    public String toString(){
    return "Employee{" +
            "id=" +id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", country='" + country + '\'' +
            ", age=" + age +
            '}';
}
}
