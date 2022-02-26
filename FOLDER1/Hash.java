/*Write a program to create a hashMap to store key and value pair.*/
package FOLDER1;

import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<String, Integer>();

        hMap.put("a", 1);
        hMap.put("b", 2);
        hMap.put("swetha", 3);
        hMap.put("rahul", 4);

        System.out.println(hMap);
        /*
         * 
         * System.out.println(hMap.containsValue(5));
         * System.out.println(hMap.remove("b", 2));
         * System.out.println(hMap);
         * 
         * hMap.replace("swetha" , 3, 500);
         * System.out.println(hMap);
         * System.out.println(hMap.values());
         * System.out.println(hMap.keySet());
         * 
         * 
         */

    }

}
