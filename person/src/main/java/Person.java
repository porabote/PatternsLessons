public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected Integer age = 1000;

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
        return (this.age == 1000) ? false : true;
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
        return this.address != null ? this.address : "Doesn't set";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age = (this.age != 1000) ? this.age++ : 0;
    }

    @Override
    public String toString() {
        return "User " +
                " " + this.getName() +
                " " + this.getSurname() +
                "; Address:" + this.getAddress() +
                "; Age: " + this.getAge();
    }

    @Override
    public int hashCode() {
        return (int) this.name.hashCode() * this.surname.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return this.child = new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
    }
}