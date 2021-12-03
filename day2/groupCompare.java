package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class groupCompare{
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> groups = new ArrayList<>();
    int totalCount = 0;

    public static void main(String[] args) {
        try{
        File textFile = new File("./day2/input.txt");
        Scanner myReader = new Scanner(textFile);
        groupCompare app = new groupCompare();
        app.readFile(myReader);
        app.numberGroups();
        app.compareGroups();
        app.readTotalCount();
        } catch(FileNotFoundException e) {
            System.out.println("File not Found");
            e.printStackTrace();
        }
    }

    private void readFile(Scanner reader){
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            numbers.add(Integer.parseInt(line));
        }
        reader.close();
    }

    private void numberGroups(){
        for(int i = 0; i < numbers.size()-2; i++){
                int sum = (numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2));
                groups.add(sum);
        }
    }

    public void compareGroups(){
        for(int i = 0; i < groups.size(); i++){
            if (i == 0){
                System.out.println(groups.get(i) + " (N/A - no previous sum");
            } else if(groups.get(i) > groups.get(i-1)) {
                totalCount++;
                System.out.println(groups.get(i) + "(Value Increased)");
            } else {
                System.out.println(groups.get(i) + "(Value Decreased)");
            }
        }
    }

    public void readTotalCount(){
        System.out.println("Total Count: " + totalCount);
    }
}