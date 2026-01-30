// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashTable myTable = new HashTable();
        
        myTable.set("bike", 29);
        myTable.set("AJ", 21);
        myTable.set("Claud", 299);
        myTable.set("Jarec", 20);

        System.out.println(myTable.keys());

    }

    public static boolean itemInCommon(int[] array1, int[] array2){

        // Using HashMap makes this operation O(2n) which is O(n) time complexity
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1){
            myHashMap.put(i, true);
        }

        for (int j : array2){
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }

}
