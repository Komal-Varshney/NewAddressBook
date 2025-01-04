import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        // we want to divide a number
        int num = 20;
        int div;

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the divisor");
        System.out.println("Enter the phone number ");
        String phone = sc.next();

        try {
            if (phone.matches("[5-9][0-9]{9}")) {
                System.out.println("Phone number is valid");
            } else {
                throw new PhoneNumberException("Invalid Exception");
                // throw -> to explicitly execute an exception i.e. it will stop the execution og the code and explicitly throw an exception
            }
        }catch(Exception e){
            e.printStackTrace(); // it backtrack and see where the error occur
            System.out.println("Invalid");
        }


//        System.out.println(phone.matches("^[5-9][0-9]{9}"));
//
//        System.out.println("Enter the email ");
//        String email = sc.next();
//        System.out.println(email.matches("^[a-zA-Z0-9-+*&._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$"));

//        while(true){
//            try{
//                div = sc.nextInt();
//                break;
//            }
//            catch(Exception e){
//                System.out.println("Enter a correct input");
//                sc.nextLine(); // we have to empty the buffer
//            }
//        }
        // people are stupid, we have to be prepared for the stupid inputs
//        System.out.println("The result is : ");
//        System.out.println(num/div);
    }
}
