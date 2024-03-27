

<!-----
NEW: Check the "Suppress top comment" option to remove this info from the output.

Conversion time: 0.921 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β31
* Tue Oct 12 2021 02:54:58 GMT-0700 (PDT)
* Source doc: 2.8 Strings
* This is a partial selection. Check to make sure intra-doc links work.
* Tables are currently converted to HTML tables.
----->



# 2.6 Strings

Java has many objects that come with every java compiler.  We have see the `Math` object, which allows us to manipulate numbers.  Let's introduce `String`, which allows us to manipulate text.

Like all standard java classes, there is a javadoc for the String class that can be helpful to you.

The methods our class is responsible for are:



* `length()`
* `indexOf( String )`
* `indexOf( String, int )`
* `substring( int, int )`
* `substring( int )`
* `equals()`
* `compareTo()`


## How Java Deals with Text



* Strings in Java are stored in memory as a consecutive sequence of characters
* Each character has an index to refer to its location
* The first index in every String is zero
* Ex. String phrase = “JAVA IS COOL”;

<table>
  <tr>
   <td>
Character
   </td>
   <td>J
   </td>
   <td>A
   </td>
   <td>V
   </td>
   <td>A
   </td>
   <td>
   </td>
   <td>I
   </td>
   <td>S
   </td>
   <td>
   </td>
   <td>C
   </td>
   <td>O
   </td>
   <td>O
   </td>
   <td>L
   </td>
  </tr>
  <tr>
   <td>Index
   </td>
   <td>0
   </td>
   <td>1
   </td>
   <td>2
   </td>
   <td>3
   </td>
   <td>4
   </td>
   <td>5
   </td>
   <td>6
   </td>
   <td>7
   </td>
   <td>8
   </td>
   <td>9
   </td>
   <td>10
   </td>
   <td>11
   </td>
  </tr>
</table>



# String Methods


## .length() Method

Strings can tell you how long they are by using the length method

Example


```
String name = readLine("Enter your name:  ")
int nameLength = name.length();    // get the number of characters in the name
System.out.println("The name " + name + " has " + nameLength + " characters in it.")
```



## .indexOf() Method

There are two indexOf methods, the first is a method where the string will find the first occurrence of an expression within the word.

Example


```
String example = "TESTING";
int result = example.indexOf( "S" );// returns 2
System.out.println(result);

result = example.indexOf( "TIN" );// returns 3
System.out.println(result);

result = example.indexOf( "T" );// returns 0, first T found
System.out.println(result);

result = example.indexOf( "Q" );// returns -1 if not found
System.out.println(result);
```

<table>
  <tr>
   <td><strong>Character</strong>
   </td>
   <td>T
   </td>
   <td>E
   </td>
   <td>S
   </td>
   <td>T
   </td>
   <td>I
   </td>
   <td>N
   </td>
   <td>G
   </td>
  </tr>
  <tr>
   <td><strong>Index</strong>
   </td>
   <td>0
   </td>
   <td>1
   </td>
   <td>2
   </td>
   <td>3
   </td>
   <td>4
   </td>
   <td>5
   </td>
   <td>6
   </td>
  </tr>
</table>


The other indexOf method takes an extra parameter that tells it where to start looking AFTER.


```
int result = example.indexOf( "T", 1 );// returns 3, first T after index 1
int result = example.indexOf( "E", 2 );// returns -1, no E after index 2
int result = example.indexOf( "N", 3 );// returns 5, first N after index 3
```



## .substring() Method 1

The substring method allows you to extract pieces of a string

The first version we’ll look at takes one parameter, where to start the substring

Example


```
String example = "substring method";
System.out.println(example.substring(10));  //prints "method"
System.out.println(example.substring(3));   //prints "string method"
System.out.println(example.substring(13));  //prints "hod"
```



## Practice


`String myString = "Ghorme Sabzi";`


<table>
  <tr>
   <td>
<strong>Code</strong>
   </td>
   <td><strong>return value</strong>
   </td>
  </tr>
  <tr>
   <td><code>myString.substring(0);</code>
   </td>
   <td>Ghorme Sabzi
   </td>
  </tr>
  <tr>
   <td><code>myString.substring(5);</code>
   </td>
   <td>e Sabzi
   </td>
  </tr>
  <tr>
   <td><code>myString.length();</code>
   </td>
   <td>12
   </td>
  </tr>
  <tr>
   <td><code>myString.substring(myString.length());</code>
   </td>
   <td>error
   </td>
  </tr>
  <tr>
   <td><code>myString.substring(myString.length() - 1);</code>
   </td>
   <td>i
   </td>
  </tr>
</table>



## .substring() Method 2

The second version of substring takes two parameters, pay CAREFUL attention!



* The place to **start**
* One space past the **end**

    ```
    String example = "substring method";

    System.out.println(example.substring(0,3));//prints "sub"
    System.out.println(example.substring(3,9));//prints "string"
    System.out.println(example.substring(10,16));//prints "method"

    ```


The substring method can be tricky, especially when there are two parameters



* The first one is the starting index
* The second parameter is **ONE PAST the index** you want to end at  (if you want to end at the character in position 8, you specify 9 as the end parameter)
* If you only specify the starting position, then substring will go to the end of the string


## .equals() Method

Recall that when comparing values of primitive types int, double, char we could use == to check if two values are equal.  However, with Strings, we can't count on == to work for us.  We must use the .equals() method.


```
String firstWord = "hello";
String secondWord = "jello";

if (firstWord.equals(secondWord)){
    System.out.println("These are equal");
}
```



## .compareTo()  Method

When comparing int values we are able to use &lt; >.  Beyond checking if strings are equal, we can check &lt; > based on alphabetical (lexicographical) order.  To do this, we need to use the compareTo() method.

   

This method returns an integer, such that of firstString and secondString contain string values:


<table>
  <tr>
   <td>lexicographical order
   </td>
   <td>firstString.compareTo(secondString)
   </td>
  </tr>
  <tr>
   <td>firstString &lt; secondString
   </td>
   <td>negative number
   </td>
  </tr>
  <tr>
   <td>firstString == secondString
   </td>
   <td>0
   </td>
  </tr>
  <tr>
   <td>firstString > secondString
   </td>
   <td>positive number
   </td>
  </tr>
</table>



```
firstString = "abc";
secondString = "bbc";

System.out.println(firstString.compareTo(secondString));  //outputs a negative number
