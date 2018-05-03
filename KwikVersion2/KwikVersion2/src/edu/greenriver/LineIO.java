package edu.greenriver;

import java.io.File;

public class LineIO {
    private LineManager theManager;
    private File theFile;
    private static final String filename = "myfile.txt";

    public LineIO(LineManager manager) {
        theManager = manager;

        theFile = new File(filename);
    }

    public void readLines() {
        // open file
        // while (!endOfFile) {
        // 		read in a line
        //		theManager.addLine(line)
        // }
        // close file
    }

    public void writeLines() {
        // open file
        // for (int i = 0; i < theManager.getNumLines(); i++) {
        //
        // }
    }
}
