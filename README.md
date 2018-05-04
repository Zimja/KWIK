### What criteria did you use to decompose the first design?
* Its easy to start and easy to use for small sized applications.

### What criteria did you use to decompose the second design?
* Its hard to start but easy to change things as time moves on, this style fits large applications much better.

### Which design is more resilient to change? And why?
* The second design is much easier for change as all the parts are seperated.

### What would have to change in the first design/implementation if the file were changed out for a database?
* Almost all of the methods would need to be changed as they are set for reading and writing from a file.

### What would have to change in the second design/implementation if the file were changed out for a database?
* Only the methods that interact directly with the read and write from the file would have to be changed.

### What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface instead of the traditional console UI (System.out)?
* The first design would have to change the methods that print the data into printing from the console to a GUI, the second would need a controller that would allow the information to be printed.

### Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to impact of the change?
* Design 2 is much easier when it comes to accomodating change, design 1 would almost need an entire overhaul if something was needed to be changed.

### Which design/implementation is easier to understand?
* Design 1 is easier to understand.

### Which design/implementation is better performing?
* Design 1 is better performing for smaller applications and Design 2 is better performing for larger applications.