package tombola;

public class Tree
{
    private Node root;

    public Node getRoot()
    {
        return root;
    }

    public void buildExampleTree()
    {
        root = new Node(new Prize(53, "Taucherbrille"));

        Node r = new Node(new Prize(78, "Niete"));
        root.setRight(r);

        Node l = new Node(new Prize(45, "USB-Stick"));
        root.setLeft(l);

        Node ll = new Node(new Prize(40, "Tasse"));
        l.setLeft(ll);

        Node lr = new Node(new Prize(49, "Spritzpistole"));
        l.setRight(lr);

        Node rr = new Node(new Prize(90, "Pflanze"));
        r.setRight(rr);

        Node lll = new Node(new Prize(11, "Gummibaeren"));
        ll.setLeft(lll);

        Node rrl = new Node(new Prize(87, "Niete"));
        rr.setLeft(rrl);

        Node rl = new Node(new Prize(77, "Hut"));
        r.setLeft(rl);
    }

    public Prize searchForNumber(int number)
    {
        // TODO: Implementieren (mit Schleife oder Rekursion)



        return searchForNumber(root,number);
    }
    //rekursion muss immer wissen wo ich gerade stehe
    private  Prize searchForNumber (Node current, int number){  //number ist number von prize nach welche ich suche
       // Fall lear
        if(current==null){
            return null;
        }
        //fall 2
        //Ich stehe auf richtige Knoten
        else if(current.getPrize().getNumber() ==number){
            return current.getPrize();
        }
       //Fall 3: links weitergehen
        else if(number< current.getPrize().getNumber()){
            return searchForNumber(current.getLeft(), number);

        }
        //fall 4 rechts weiter gehen
        else {
            return searchForNumber(current.getRight(),number);
        }
    }
}
