package party;

import java.util.*;

public class InnerCircle {
    public List<Person> getFriends(Person person, int level) {
        ArrayList<Person> result = new ArrayList<>();
        HashMap<Person, Integer> distance = new HashMap<>();
        ArrayDeque<Person> queue = new ArrayDeque<>();

        // TODO: Initialisieren
        queue.add(person);
        distance.put(person,0);

        while (!queue.isEmpty()) {
            // TODO
            //Liefern des ersten Element aus queue und löschen aus der Queue
            Person current =queue.remove(); //beim 1 durchlauf = andy

            //Wenn die gesuchte Distanz erreicht ist, interessieren mich die Nachbarn nicht mehr.
            //Alternative: Alles reinspeichern un dann aussortieren
if(distance.get(current)==level){
    continue;
}
            result.add(current);
            //in current friends. beim 1.durchlaug die freunde von andy gespiechert
            for(Person friend: current.friends){
                //prüfer ob man Person schon besuchthat
                if(result.contains(friend)){
                    continue;  //geht weiter bei nächste element
                }
                queue.add(friend);
                distance.put(friend, distance.get(current)+1);

            }

        }

        return result;
    }
}
