class Person{
    String firstName;
    String lastName;
    char gender;
    int age;
}

class PersonTest{
    public static void main(String[] args) {
        Person p = new Person();

        p.firstName = "Test";
        p.lastName = "test last name";
        p.gender = 'M';
        p.age = 30;

        System.out.println("First name "+p.firstName);
        System.out.println("Last name" + p.lastName);
        System.out.println("Gender " + p.gender);
        System.out.println("Age " + p.age);
    }
}