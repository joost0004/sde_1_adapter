package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {

    private static String[] goodAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response



        Boolean ans1 = findAnswer(reader.readLine());

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"


        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }

    private static boolean findAnswer(String word){
        for( int i=0; i<goodAnswers.length; i++){
            if(word.equals(goodAnswers[i]))
                return true;
        }
        return false;
    }
}
