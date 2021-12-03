package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int compareValues(Scanner reader){
        ArrayList<Integer> values = new ArrayList<Integer>();
        int count = 0;
        while (reader.hasNextLine()){
            String data = reader.nextLine();
            values.add(Integer.parseInt(data));
        }
        for(int i=1; i < values.size(); i++){
            
            if(values.get(i) > values.get(i-1)){

            }
        }
        return count;
    }
}