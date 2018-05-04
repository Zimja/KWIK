package edu.greenriver;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("KWIK Index Production System - Version 1");

        ArrayList<String> allLines = readLines();
        circularShift(allLines);
        alphabetize(allLines);
        writeLines(allLines);
    }

    public static ArrayList<String> readLines() {
        ArrayList<String> result = new ArrayList<String>();

        try
        {
            Reader in = new FileReader("src/text/input.txt");
            BufferedReader br=new BufferedReader(in);
            while(true)
            {
                String input=br.readLine();
                if(input==null)
                {
                    break;
                }
                result.add(input);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        return result;
    }

    public static void circularShift(ArrayList<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, circularShiftLine(lines.get(i)));
        }
    }

    public static String circularShiftLine(String line) {
        String[] words = line.split(" ");
        String firstWord = words[0];

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1; i < words.length; i++) {
            sj.add(words[i]);
        }

        sj.add(firstWord);
        return sj.toString();
    }

    public static void alphabetize(ArrayList<String> lines)
    {
        Collections.sort(lines);
    }

    public static void writeLines(ArrayList<String> lines)
    {
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter("src/text/input.txt");

            for(int i = 0; i < lines.size(); i++)
            {
                System.out.println(lines.get(i));
                pw.println(lines.get(i));
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
