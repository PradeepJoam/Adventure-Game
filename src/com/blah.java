package com;

import java.util.Scanner;

public class blah
{
    public static void main (String[] args)
    {
        String yourName;
        String output;
        String sentence;
        char meetingNiceWolf;
        char followRejectNiceWolf;
        char spyRunHomeNiceWolf;
        char answerTwo;
        char letInOrIgnoreBadWolf;
        char pourWaterOrKnockOutBadWolf;
        char answerThree;
        char answerFour;
        char answerFive;
        int guessNumber;
        Scanner In=new Scanner(System.in);
        System.out.println ("Type in your name:"); //User imputs name
        yourName = In.next();
        System.out.println ("The Tale of the Piggy and the two Wolves");
        System.out.println ("____________________________________________");
        output = "\n Once upon a time, " + yourName + ","
            + "\n a little piggy was walking in the woods."
            + "\n Suddenly, a wolf appears infront of you."
            + "\n What do you do?";
        System.out.println (output);
        // User's Decision-Meeting the nice wolf.
        System.out.println ("Choices (2):");
        System.out.println ("____________________________________________");
        System.out.println ("Press A to hide in a bush.");
        System.out.println ("Press B to talk to the wolf.");
        meetingNiceWolf = In.next ().charAt(0);
        if ( meetingNiceWolf == 'A' || meetingNiceWolf == 'a')
        {
        sentence = "\n You hide in the bush and suddenly, you fall into a huge hole."
                 + "\n A human laughs from above. He tells you that he will let you"
                 + "\n out if you correctly guess what number he is thinking from 1"
                 + "\n to 10";
        System.out.println (sentence);
        output = output + sentence;
        System.out.println ("____________________________________________");
        System.out.println ("Guess a number between 1 to 10");
        }
      guessNumber = In.nextInt ();
      if (guessNumber == 6)
      {
      sentence ="\n The hunter sigs and lets you go free. Luckly guess!"
            + "\n You live happily ever after."
            + "\n The end";
      System.out.println (sentence);
      output = output + sentence;
      }
      else
      {
      sentence = "\n The hunter smiles and tells you that you are wrong."
                 +"\n Oh no! You are going to get eaten!"
                 +"\nThe end";
            System.out.println (sentence);
            output = output + sentence;
      }
        if (meetingNiceWolf == 'B' || meetingNiceWolf == 'b')
        {
        sentence = "\n\"Hello little piggy.\" said the wolf."
                + "\n\"Hello.\" you manage to say out of fear."
                + "\n Suddenly, your stomach begins to grumble."
                + "\n\"Do you want to go to my house?\"asks"
                + "\n the wolf.\"I see that you are hungry.\"";
        System.out.println (sentence);
        output = output + sentence;
        
        System.out.println ("Choices (2):");
        System.out.println ("____________________________________________");
        System.out.println ("Press A to follow the wolf.");
        System.out.println ("Press B to reject his offer.");
      }  
      followRejectNiceWolf = In.next ().charAt(0); 
      
      if (followRejectNiceWolf == 'A' || followRejectNiceWolf == 'a')
      {
      sentence = "\n Turns out that the wolf only wanted"
               + "\n to be your friend because he was lonely."
               + "\n You and the wolf eat an apple pie and become"
               + "\n the best of friends."
               + "\n The end.";
      System.out.println (sentence);  
      output = output + sentence;
      }
      else if (followRejectNiceWolf == 'B' || followRejectNiceWolf == 'b')
      {
      sentence = "\n The wolf signs and invites you to come tomorrow."
               + "\n He tells you that he wants to share an apple pie"
               + "\n with you and be your friend.";
      System.out.println ("Choices (2):");
       System.out.println ("___________________________________________________________");
       System.out.println ("Press A to secretly go to the wolf's house to spy on him.");
       System.out.println ("Press two to run home.");
      
      System.out.println (sentence);  
      output = output + sentence;
      }
      
}}
