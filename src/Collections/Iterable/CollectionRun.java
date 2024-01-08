package Collections.Iterable;

public class CollectionRun {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        var iterator = list.iterator();

        // for each loop not accessible when iterable is not implemented
        while(iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }

        for(var x : list){
            System.out.println(x);
        }
    }
}
