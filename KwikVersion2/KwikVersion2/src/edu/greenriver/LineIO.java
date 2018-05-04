package edu.greenriver;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class LineIO {
    private LineManager theManager;
    private File theFile;
    private static final String filename = "myfile.txt";

    public LineIO(LineManager manager)
    {
        theManager = manager;

        theFile = new File(filename);
    }

    public void readLines()
    {
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
                theManager.addLine(input);
            }
            in.close();
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // while (!endOfFile) {
        // 		read in a line
        //		theManager.addLine(line)
        // }
        // close file

    }

    public void writeLines()
    {
        PrintWriter pw = null;
        try
        {
            ArrayList lines = new ArrayList();
            pw = new PrintWriter("src/text/input.txt");
            Iterator i=lines.iterator();

            while(i.hasNext())
            {
                pw.println((String)(i.next()));
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // for (int i = 0; i < theManager.getNumLines(); i++) {
        //
        // }
    }
}
