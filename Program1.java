class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // .length() example
    String strName = readLine("Enter your name:  ");
    int nameLength = strName.length();    // get the number of characters in the name
    System.out.println("The name " + strName + " has " + nameLength + " characters in it.");
    
    /*
    String example = "TESTING";
    int result = example.indexOf( "S" );// returns 2
    System.out.println(result);

    result = example.indexOf( "TIN" );// returns 3
    System.out.println(result);

    result = example.indexOf( "T" );// returns 0, first T found
    System.out.println(result);

    result = example.indexOf( "Q" );// returns -1 if not found
    System.out.println(result);
    
    String example = "substring method";
    System.out.println(example.substring(10));  //prints "method"
    System.out.println(example.substring(3));   //prints "string method"
    System.out.println(example.substring(13));  //prints "hod"

    String example2 = "St. Augustine CHS";
    System.out.println("The length of " +  example2 + " is " + example2.length());
    System.out.println(example2.substring(5));
    System.out.println(example2.substring(7, 9));
    */
    
  }
}
