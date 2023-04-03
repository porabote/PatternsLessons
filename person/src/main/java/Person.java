public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected Integer age;

    protected PersonBuilder child;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return (this.age != null) ? true : false;
    }

    public boolean hasAddress() {
        return (this.address != null) ? true : false;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getAge() {
        return this.hasAge() ? this.age : null;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return "User" + this.name;
    }

    @Override
    public int hashCode() {
        return (int) this.name.hashCode() * this.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return this.child = new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
    }
}