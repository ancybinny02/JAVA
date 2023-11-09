import java.io.*;
import java.util.*;
class Stringman
{
  public static void main(String args[])
  {
    String s="We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";
    System.out.println("Given string : " + s);
    System.out.println("Java String Methods : ");
    System.out.println("________________________");
    System.out.println("charAt(10) : " + s.charAt(10));
    String s1="Hi world";
    System.out.println("compareTo() : " + s.compareTo(s1));
    System.out.println("concat() : " + s.concat(s1));
    System.out.println("contains() : " + s.contains("?"));
    System.out.println("endsWith() : " + s.endsWith("."));
    System.out.println("equals() : " + s.equals(s1));   
    System.out.println("equalsIgnoreCase() : " + s.equalsIgnoreCase(s1));
    System.out.println("format() : " + String.format("Hello %d", 2347210));
    System.out.println("getBytes() : " + s.getBytes());
    /**char[] ch1=new char[10];
    s.getChars(5,10,ch1,0);
    Character.toString(ch1);
    for (char c : ch1) {
            System.out.print(c + " ");
        }*/
    System.out.println("\n");
    System.out.println("indexOf() : " + s.indexOf("4"));
    System.out.println("intern() : " + s.intern());
    System.out.println("isEmpty() : " + s.isEmpty());
    System.out.println("join() : " + s1.join("!","world","hello","meet","nice")); 
    System.out.println("lastIndexOf() : " + s.lastIndexOf("o")); 
    System.out.println("length() : " + s.length()); 
    System.out.println("replace() : " + s1.replace(" ","!")); 
    System.out.println("replaceAll() : " + s.replaceAll(" ","*")); 
    System.out.println("split() : " + s1.split(" "));
    System.out.println("startsWith() : " + s.startsWith("W")); 
    System.out.println("substring() : " + s.substring(0,7)); 
    /**char[] ch=s1.toCharArray();
    System.out.println("CHAR ARRAY"); 
    for(int i=0;i<s1.length();i++)
    {
      System.out.println("     " +s1[i]);
    }*/
    System.out.println("toLowerCase() : " + s.toLowerCase()); 
    System.out.println("toUpperCase() : " + s.toUpperCase());
    String s2="   CHRIST  "; 
    System.out.println("trim() : " + s2.trim()); 
    
    System.out.println("valueOf() : " + String.valueOf("s2"));  
  }
}