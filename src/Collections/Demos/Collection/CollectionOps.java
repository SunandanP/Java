package Collections.Demos.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionOps {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        System.out.println(collection);


        Collections.addAll(collection, "E","F","G");
        System.out.println(collection);

        System.out.println(collection.contains("D"));

        System.out.println(collection.isEmpty());

        String[] array = collection.toArray(new String[0]);
        for(String item : array){
            System.out.println(item);
        }

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(other);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
