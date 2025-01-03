import java.util.Scanner;

public class Contact {
    // do we need generics to create contact
    // we don't need a generic in contact because it is the lowest fundamental object. Based on contact, we can't modify the contact anymore. So, it should treated as a struct but since our code requires an interface to work, we have to implement it .
    // why it requires interface?

    private String name;
    private String email;
    private String state;
    private int phoneNumber;
    // it is not secured because anything outside the object have the ability to change and the scope lies outside. To use outside we use getter/setter


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String email, String state, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter phone number");
        int phone = sc.nextInt();
        return new Contact(name,email,state,phone);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
