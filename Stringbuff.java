import java.io.*;
import java.util.*;
class Stringbuff
{
  public static void main(String args[])
  {
    StringBuffer s = new StringBuffer("Hello, World");
    System.out.println(s.append("Nice to meet you."));
    System.out.println(s.insert(5,"!"));
    System.out.println(s.replace(1,3,"Hi"));
    System.out.println(s.delete(6,11));
    System.out.println(s.charAt(1));
    s.setCharAt(0,'!');
    System.out.println(s);
    System.out.println(s.capacity());
    System.out.println(s.toString());
    System.out.println(s.substring(3));
    System.out.println(s.substring(0,3));

       
    
  }
}
