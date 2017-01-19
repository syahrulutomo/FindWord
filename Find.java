
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Find {

    public static void main(String[] args) throws FileNotFoundException
    {
       String input = args[0];
       for(int i=1; i < args.length; i++)
       {
           System.out.print("File: "+args[i]+" -->");
           File one = new File(args[i]);
           Scanner in = new Scanner(one);

           while(in.hasNextLine())
           {
               String line = in.nextLine();
               if(line.contains(input))
               {
                   System.out.print(" "+line+" \n");
               }
           }
       }

    }

}
