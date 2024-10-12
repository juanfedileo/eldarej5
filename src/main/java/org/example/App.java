package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String[] myarray = new String[10];
        myarray[0] = "First word";
        myarray[1] = "SecondWord";
        myarray[2] = "Third word";
        StringBuilder aux = new StringBuilder();
        for(int i=0; i<myarray.length; i++){
            if (myarray[i] != null) {
                aux.append(myarray[i].toLowerCase());
                aux.append(' ');
            }
        }
        System.out.println(aux.toString());
    }
}
