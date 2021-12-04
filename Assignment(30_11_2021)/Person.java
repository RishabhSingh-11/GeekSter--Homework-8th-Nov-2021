//2. Modify the code below to add more constructors. Also modify the main method to test the new constructors.

public class Person
{
    // fields
    private String name;
    private String email;
    private String phoneNumber;

    // constructor
    public Person(String theName)
    {
        this.name = theName;
    }

    // Newly Added Constructor

    public Person(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // methods - getters
    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getPhoneNumber() { return this.phoneNumber;}

    // methods - setters
    public void setName(String theName) { this.name = theName;}
    public void setEmail(String theEmail) {this.email = theEmail;}
    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
    public String toString()
    {
        return this.name + " " + this.email + " " + this.phoneNumber;
    }

    // main method for testing
    public static void main(String[] args)
    {
        Person p1 = new Person("Sana");
        System.out.println(p1);
        Person p2 = new Person("Jean");
        p2.setEmail("jean@gmail.com");
        p2.setPhoneNumber("404 899-9955");
        System.out.println(p2);
        Person p3 = new Person("rishabh@gmail.com", "0123456789");
        System.out.println(p3);
        Person p4 = new Person("Rohit", "rohit@gmail.com", "1234568079");
        System.out.println(p4);
    }
}
