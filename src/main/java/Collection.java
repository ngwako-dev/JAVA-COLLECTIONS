import java.util.*;

public class Collection {

    int Number=9;


    public static int queue(int subArraysize){

        LinkedList<Integer> queue = new LinkedList<Integer>();
        //add
        queue.add(6);
        queue.add(2);
        queue.add(2);
        queue.add(8);
        queue.add(3);
        queue.add(7);
        queue.add(1);
        queue.add(4);
        queue.add(4);
        queue.add(4);


        int [] subArray=new int[subArraysize];
        int unique=1;
        int maxiUnique=0;

        //loop for creating a subArray based on subArraysize
        for (int j=0;j<queue.size()-subArraysize;j++) {
            ArrayList<Integer> checkedNumbers=new ArrayList<>();

            for (int i = 0; i < subArraysize; i++) {
                subArray[i]=queue.get(j+i);
            }
            //loop each number in the subArrays
            for(int a:subArray) {

                if(subArray[0]!=a && !checkedNumbers.contains(a)){
                    checkedNumbers.add(a);
                    unique++;
                }
            }

            if (unique>maxiUnique){
                maxiUnique=unique;
            }
            unique=1;
            //check other unique numbers for other subArrays
        }
        return +maxiUnique;

    }

}

