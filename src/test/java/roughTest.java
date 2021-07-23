import java.util.*;
import java.util.stream.Collectors;

public class roughTest {

    public static void main(String[] args){

        /*
        array list
        Set
        map
        list
        hashmap
        tree
        */

        Set <String> set1= new HashSet<>();
        set1.add("one");
        set1.add("bce");
        set1.add("zzz");
        set1.add("one");
        set1.add("aaa");

        System.out.println("HASHSET"+set1);


        Set <String> set2= new TreeSet<>();
        set2.add("one");
        set2.add("bce");
        set2.add("zzz");
        set2.add("one");
        set2.add("ane");

        System.out.println("TREE SET"+set2);



        //map

      // Map viv2 = new HashMap<String,String>();

        //map is an interface
        Map<String,String> viv3    =   new HashMap<>(); // best

        HashMap<String,String> viv     =   new HashMap<>();
        viv.put("infy","test Engg");
        viv.put("infy","Qual Engg");
        viv.put("deloit","scon");
        System.out.println("HASHMAP"+viv);

        //treemap - sorted way on basis on Key
        Map<String,String> viv1     =   new TreeMap<>();
        viv1.put("infy","test Engg");
        viv1.put("deloit","scon");
        System.out.println("TREEMAP"+viv1);

//array list
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        Collections.sort(alist);
        System.out.println(alist);


        System.out.println("*****************************************************************************");
       /* int i = 5;
        Integer b =5;
        b=Integer.valueOf(i);
        i=b.intValue();*/

        /*String str ="ankit";
        b.toString();*/

        String str = "By default the elements of a SortedSet are ARE the in ascending order, the elements starting with";
        String[] strsplit = str.split(" ");
        Map<String,Integer> countMap= new TreeMap<>();
     //  Arrays.asList(str.split(" ")).stream().collect(Collectors.toMap());
        int i=0;
        while(i< strsplit.length){
            if(countMap.containsKey(strsplit[i].toLowerCase())){
                countMap.put(strsplit[i].toLowerCase(),countMap.get(strsplit[i].toLowerCase())+1) ;
            }else {
                countMap.put(strsplit[i].toLowerCase(),1) ;
            }
               i++;
        }
        System.out.println(countMap);

    }

}
