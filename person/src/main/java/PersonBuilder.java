public class PersonBuilder {

    protected String name;
    protected String surname;
    protected String address;
    protected Integer age = 1000;

    public PersonBuilder PersonBuilder() {
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {

        if (this.age != 1000 && this.age < 0) {
            throw new IllegalStateException("Age must be more or equals than 0");
        }
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Person must has name and surname");
        }

        if (this.age == 1000) {
            return new Person(this.name, this.surname);
        } else {
            return new Person(this.name, this.surname, this.age);
        }
    }
}
