package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    int count = 0;
    public static void main(String[] args) {
        try {
            File myObj = new File("./input.txt");
            Scanner myReader = new Scanner(myObj);
            ReadFile app = new ReadFile();
            app.compareValues(myReader);
            app.printCount();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public int compareValues(Scanner reader){
        ArrayList<Integer> values = new ArrayList<>();
        while (reader.hasNextLine()){
            String data = reader.nextLine();
            values.add(Integer.parseInt(data));
        }
        reader.close();
        for(int i=1; i < values.size(); i++){
            if(values.get(i) > values.get(i-1)){
                count++;
                System.out.println(values.get(i) + " (Value Increased)");
            }else{
                System.out.println(values.get(i) + " (Value Decreased)");
            }
        }
        return count;
    }
    public void printCount(){
        System.out.println("Total increased count: " + count);
    }
}