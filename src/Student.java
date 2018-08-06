import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Student {
    public static  void main(String args[]) throws IOException {
        HashMap<String, ArrayList<Integer>> hmap= new HashMap<String,ArrayList<Integer>>();
        File file = new File("src/data.txt");
        Scanner sc = new Scanner(file);
        String index;
        String key="0";
        while (sc.hasNextLine())
        {
            ArrayList<Integer> arrli = new ArrayList<Integer>();
            index=sc.nextLine();
            System.out.println(index);
            String[] array =index.split(" ");
            key=array[0];
            for(int i=1;i<array.length;i++)
            {
                arrli.add(Integer.parseInt(array[i]));
            }
            hmap.put(key,arrli);
        }
    }
}
