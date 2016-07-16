
public class String_ {
public static void main(String[] args){
    String text=new String("Hello World");
    String text2= text.concat("It's a good day"); //One more object, no change to the first object
    String text3= text+ "It's a great day";
    String text4= "Hello World"; //interned string
    text.equals(text4); //goes into the String object character by charcter
    System.out.println(text == text4) ; // Stores different locations , compares the values of the variables themselves.
    System.out.println(text.equals(text4)) ;
}
}