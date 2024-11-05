// import statements
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Queue;


public class PriorityQueueLab {
    public static void main(String[] args){
        Scanner input = null;
        try{
            input = new Scanner(new File("RandIntegers.txt"));
         } catch(FileNotFoundException e){
             System.out.println("File wasn't found");
         }

         Queue<Integer> queue = new PriorityQueue<>();

         while(input.hasNextInt()){
            queue.add(input.nextInt());
         }

        int end = queue.size();
         for(int i = 0; i < end; i++){
            System.out.println(queue.remove());
         }
    }
  
}

