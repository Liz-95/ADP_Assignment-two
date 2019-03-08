package CollectionListMapSet;

import java.util.*;

public class CollectionClass {
    //Collection
   // public void collection() {
       // Map<String, Integer> mapone = new HashMap<String, Integer>();
        //mapone.put("a", new Integer(100));
      //  mapone.put("b", new Integer(200));
       // mapone.put("c", new Integer(300));
       // mapone.put("d", new Integer(400));

        //This returns set view
       // Set<Map.Entry<String, Integer>> setone = mapone.entrySet();
       // for (Map.Entry<String, Integer> me : setone) {
        //    System.out.print(me.getKey() + ":");
        //    System.out.println(me.getValue());

      //  }
    //}

    public void list(){
        List<Integer> listone = new ArrayList<Integer>();
        listone.add(0,10);
        listone.add(1,30);
        listone.add(2,40);
        listone.add(3,50);
        System.out.println(listone);

    }

    public void set(){
        Set<String> setone = new HashSet<String>();
        setone.add("Dream");
        setone.add("Complicated");
        setone.add("Aspirations");
        setone.add("Faith");


        System.out.print("Set without duplicates");
        System.out.println(setone);
    }

    public void map() {
        TreeMap<Integer, String> treeMapone = new TreeMap();
        treeMapone.put(0, "Colour");
        treeMapone.put(1, "Your");
        treeMapone.put(2, "World");
        treeMapone.put(3, "Tumelo!");

        System.out.println("The treeMap values are as follows:\n");
        System.out.println("Key, Value");

        for (Map.Entry m : treeMapone.entrySet()) {
            System.out.println(m.getKey() + " , " + m.getValue());
        }


    }


//public static void main(String[]args){
  //      CollectionClass cClass = new CollectionClass();
    //cClass.collection();
   /// cClass.list();
    //cClass.set();
    //cClass.map();
//}


}
