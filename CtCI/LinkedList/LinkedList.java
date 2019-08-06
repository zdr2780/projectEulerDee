public class LinkedList<T1>{
    Node<T1> head;
    public LinkedList(Node<T1> node){
        this.head = node;
    } 
    
    public String toString(){
        StringBuilder output = new StringBuilder();
        Node<T1> current = this.head;
        do{
            output.append(current);
            current = current.next;
        } while (current != null);
        return output.toString();
    }
}
