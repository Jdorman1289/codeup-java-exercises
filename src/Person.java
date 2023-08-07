public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s%n", this.name);

    }


    public static void main(String[] args) {
//        Person Jake = new Person("Jake");
//
//        System.out.println(Jake.getName());
//
//        Jake.setName("Mr. Not Jake now");
//
//        Jake.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}
