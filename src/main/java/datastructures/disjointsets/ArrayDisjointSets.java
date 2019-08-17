package datastructures.disjointsets;

import datastructures.dictionaries.IDictionary;
//import misc.exceptions.NotYetImplementedException; //j: commented it out

//Jason: import these
import datastructures.dictionaries.ChainedHashDictionary;
//import datastructures.dictionaries.KVPair;

/**
 * @see IDisjointSets for more details.
 */
public class ArrayDisjointSets<T> implements IDisjointSets<T> {
    // Do NOT rename or delete this field. We will be inspecting it directly in our private tests.
    int[] pointers;

    /*
    However, feel free to add more fields and private helper methods. You will probably need to
    add one or two more fields in order to successfully implement this class.
    */
    //Jason: added
    int current; //
    private static final int INITIAL_CAPACITY = 10;
    int capacity; // capacity of the class field pointer
    IDictionary<T, Integer> dic; //stores reference to object(Type T) and its rank(int)


    public ArrayDisjointSets() {
        current = 0;
        capacity = INITIAL_CAPACITY;
        pointers =  new int[INITIAL_CAPACITY];
        dic = new ChainedHashDictionary();
    }

    @Override
    // TODO: throw exception when ...
    public void makeSet(T item) {

        dic.put(item, current);

        /*
        if (size == this.pointers.length - 1) { //resize pointers when needed
            capacity  = capacity*2;
            int[] newPointers = new int[capacity];
            for (int i = 0; i < pointers.length; i++){
                newPointers[i] = pointers[i];
            }
            pointers = newPointers;
        }
         */
        current += 1;
    }

    @Override
    public int findSet(T item) {
        int index = dic.get(item); //map the item to its index of pointers
        while (index != -1){ //not a parent

            return pointers[index];
        }
        return index;
    }

    @Override
    public boolean union(T item1, T item2) {

        //if ...


        //update size
        //size += 1;
        //return true;
        return false; //neither of item1 or item2 is in this set
    }
}
