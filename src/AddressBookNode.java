public class AddressBookNode <T>{
    Contact data;
    AddressBookNode<T> next;

    @Override
    public String toString() {
        return "AddressBookNode{" +
                "data=" + data +
                '}';
    }

    public AddressBookNode<T> createNode(Contact c1){
        AddressBookNode<T> t1 = new AddressBookNode<>();
        t1.data = c1;
        t1.next = null;
        return t1;
    }
}
