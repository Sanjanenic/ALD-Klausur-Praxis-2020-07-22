package polonaise;

public class DanceDoubleLinkedList
{
    private Node first;
    private Node last;

    public Node getFirst()
    {
        return first;
    }

    public Node getLast()
    {
        return last;
    }

    // Methode, um eine(n) neue(n) TaenzerIn an erster/vorderster Position
    // der Polonaise einzufügen
    public void insertDancerAtFirstPos(String name)
    {
        // TODO: Implementieren
        //konten estellen zuerst
        Node newNode= new Node(name);

       // FALL 1 - Liste ist leer
        if(first==null){
            first=newNode;
            last=newNode;
        }
        //Fall 2 _ Nur eine Konten
         else {  //ovdje ako stavim if bedinung ne gleda oba slucaja
             newNode.setNext(first);
             first.setPrev(newNode);
             first=newNode;
         }


    }
}
