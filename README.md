The goal of this assignment is to evaluate options for functional decomposition. There are many ways to decompose and organize a system and we want to find out if some ways are better than others. To do this, we will design a small program called KWIC

KWIC Index Production System

KWIC accepts a file with a set of lines
Each line has a set of words, each word consists of a set of characters
Each line can be "circularly" shifted by removing the first word in the line and appending it to the end of the line
KWIC outputs a listing (console + file) of all circular shifts of all lines in alphabetical order
Possible future (but not required now): use of a database instead of a file, a GUI front end instead of a console.
Part 1 (5 points)

Create an initial design of your own choosing for this in Java. Set up the classes, methods, and main method. You do not need to write method bodies at this time, but will at a later point
 in time. You will want to create a Java project in the IDE of your choice, set up the files, classes, methods and main, and make sure it compiles and runs correctly, even if the functionality is incomplete.

Part 2 (5 points)

Create an alternative design for the KWIC program in Java. You may use one of the examples presented in class as a model. You may also find a way to use one of the examples presented 
in class and modify it to make it better, or make it your own. You will want to create a Java project in the IDE of your choice, set up the files, classes, methods and main, and make sure it
 compiles and runs correctly, even if the functionality is incomplete.

Part 3 (3 points)

Implement the KWIC system functionality in both versions of your design. You will need to create some sample files for testing to verify that the program is working correctly.

Part 4 (7 points)

Provide a brief technical summary (about one page) to compare and contrast your two designs. Your writeup should address questions such as:

What criteria did you use to decompose the first design?
What criteria did you use to decompose the second design?
Which design is more resilient to change? And why?
What would have to change in the first design/implementation if the file were changed out for a database?
What would have to change in the second design/implementation if the file were changed out for a database?
What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface instead of the traditional console UI (System.out)?
Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to impact of the change?
Which design/implementation is easier to understand?
Which design/implementation is better performing?
How does the principle of information hiding relate to all of this?
Extra Credit (1-2 pts)

Implement jUnit unit testing for both of your designs/implementations, including some tests for some of the major functionality. (1 pt)
Is one design/implementation more testable than another? Is there anything that is not testable in either design? Explain why. (1 pt)
Put your code into a GitHub repository and submit a link to it within your technical summary/writeup, which you can submit online. You may also choose to do your write up directly 
in the GitHub readme.md (markdown) file. This design comparison / case study of KWIC is a nice portfolio piece for you to share with others as it (1) shows that you've read a seminal 
paper in software engineering (Parnas 72) and that you've taken the time to do the study yourself and analyze and understand the principle of information hiding.