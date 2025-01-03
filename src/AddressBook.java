public class AddressBook <T>{
    // since address book doesn't have list of itself, it stores the reference and those type of feature
    // we will be creating an addressbooknode

    AddressBookNode<T> head = null;
    AddressBookNode<T> curr = null;

    public void addToAdBook(T a){
        AddressBookNode<T> a1 = new AddressBookNode();
        if(head == null){
            head = a1.createNode((Contact) a);
        }
        else{
            curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr = a1.createNode((Contact) a);
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Address Book is empty");
        }
        else{
            curr = head;
            while(curr!=null){
                System.out.println(curr);
                curr = curr.next;
            }
        }
    }

}
