import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook<Contact>a1 = new AddressBook<>();
        System.out.println("Welcome to Address Book");
//        Contact c1 = Contact.createContact();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            System.out.println("Enter 1 to add contacts in address book \nEnter 2 to display contacts");
            int i = sc.nextInt();
            switch(i){
                case 1 -> a1.addToAdBook(Contact.createContact());
                case 2 -> a1.display();
                default -> System.out.println("Enter the valid input");
            }
            System.out.println("Press 0 to exit");
            input = sc.nextInt();
        }while(input!=0);


    }
}