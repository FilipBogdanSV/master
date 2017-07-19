public class CollectionGuava {

        public static void main(String args[]) {

            //create a multiset collection
            Multiset<String> multiset = HashMultiset.create();

            multiset.add("a");
            multiset.add("b");
            multiset.add("c");
            multiset.add("d");
            multiset.add("a");
            multiset.add("b");
            multiset.add("c");
            multiset.add("b");
            multiset.add("b");
            multiset.add("b");

            System.out.println(multiset.count("a"));
        }
    }

