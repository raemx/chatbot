/* ***************************************
 AUTHOR: RACHEL OYOO
   My program is a chat bot which will be able to talk to people
 *****************************************/

import java.util.Scanner; //imports the scanner to allow
import java.util.Arrays;
class project8  //creates a new class called project8
{

 public static void main (String[] param) // the method main is calls the method name which executes the task of asking the user their name
  {
     countdown(); //runs procedual call countdown

     String name2 = name(); //saves copy of local variable "name", returned from function call "name();", to new variable "name"
     int age2 = age(); //saves copy for local variable "age", returned from function call "age();", to new variable "age"

     feel(); //executes procedual call feel();

     String interests2 = interests(); //saves copy for local variable "interest", returned from function call "interests();", to new variable "interests"

     user(name2, age2, interests2); //passes local variables to method user
     relatives(); //executes procedual call relatives();

     System.exit(0); //exits program
   }//END main

 public static void user(String username, int userage, String userinterests)//stores local variables passed to method user to these three new local variables
   {
     User u = new User(); //creates new record in class User called u
     //sets values written by user in this record
     u = setName(u, username); //stores the name set in method setName, to record u
     u = setAge(u, userage); //stores the age set in method setAge, to record u
     u = setInterests(u, userinterests); //stores the interest set in method setInterests, to record u

     //prints out these variables
     System.out.println("Let's see what I can remember of you. Your name is " + getName(u) + ". Your age is " + getAge(u) + ". You like " + getInterests(u) + ".");
     //uses get methods to pass the record name through (which will in turn return the specified records name age and interest)
     return; //returns nothing - method type is void
   }

 public static void countdown()
   {
    Scanner scanner = new Scanner(System.in); //allows user input a number
    System.out.println("Type any number...");

    while (!scanner.hasNextInt()) //while user input is not a integer value
      {
        System.out.println("Please write a number.");
        scanner.nextLine(); //moves on to next piece of code after user has inputed value
      }
        int no = scanner.nextInt();//declares and initialises locaal variable no to only allow integer values

    for (int n = no; n>0; n = n-1 ) //a for loop that starts at value user enters and goes down by 1 to 0
      {
        System.out.println(n + "..."); //prints out number each time
      }
        System.out.println("HELLO!!!!"); //once reached 0, this will be printed as it doesnt meet the condition anymore

        return; //no value returned - method type void
    }

  public static String name() // asks the user their name, this method name returns string values only
    {
     String name = input("Hi. I am a chatbot. What is your name?");

     while (!name.matches("[a-zA-Z]+")) //while loop that will not allow non string values in variable name
     {
      name = input("Please enter a valid name!: ");//after user types a valid string value, loop is exited
     }

     if (name.equals("Rachel")) //if loop where two different statementsz are printed dependant on if it's a specific name or not
      {
        System.out.println("Hi " + name + ".That's an amazing name! It's nice to meet you."); //prints value in variable name within statement
      }
      else
        {
        System.out.println("Hi " + name + ". It's nice to meet you.");
        }

      return name; //returns value in name to main method which must be string
    }//END name

  public static int age() //function call method age returns int values only
    {
     Scanner scanner = new Scanner(System.in); //allows for user input
     System.out.println("How old are you?");

     while (!scanner.hasNextInt()) //while user input is not a integer value
      {
        System.out.println("Please write a number.");
        scanner.nextLine(); //moves on to next piece of code after user has inputed value
      }
        int age  = scanner.nextInt();//declares and initialises local variable age to only allow integer values

        return age; //returns int value in age to main method

    }
  public static void feel() //procedual call method that to ask users feeling
    {
     String feel = input("How are you today? A: GOOD  B: OKAY  C:BAD");

     if (feel.equals("A")) //if loop where different letters return different comments about the users feeling
      {
        System.out.println("I'm glad you feel good!");
      }
     else if (feel.equals("B"))
      {
        System.out.println("Oh okay.");
      }
     else if (feel.equals("C"))
      {
      System.out.println("Oh no! I hope you feel better soon!");
      }
     else //if any other value is written, loop prints OK
      {
      System.out.println("That isn't one of the options, but OK.");
      }

      return;
    } //END feel

  public static String interests()
    {
      String interests = input("So, what is one of your interests? I'm interested in music.");
      System.out.println("That's really cool!");

      return interests; //returns string value in local variable interests to main method
    }//END interests

  public static User setName(User u, String name) //stores the variables passed from main into local variables "u" and "name" which can be used in this method only
//method setName where new record "u" is created and local variable name
  {
    u.name = name; //takes copy of value name user inputs, and stores it in name part of record
    return u; //returns value of name when method is called
  }

  public static User setAge(User u, int age)
  {
    u.age = age; //takes copy of value age user inputs, and stores it in age part of record
    return u; //returns and updates value of age when method is called
  }

  public static User setInterests(User u, String interests)
  {
    u.interests = interests;
    return u;
  }

  public static String getName(User u) //accesses record u
  {
    return u.name; //returns name part of record
  }

  public static int getAge(User u)
  {
    return u.age;
  }

  public static String getInterests(User u)
  {
    return u.interests;
  }

  public static void relatives() //relatives method which allows user input for names and heights of relatives
  {
     Relative[] yourfamilys = new Relative[3]; //new array of type relative where name and height can be stored in each indexed array

     for (int i = 0; i <= 2; i++) //for loop which allows input for array up to array length
      {
       String rname = input("Give me one of your relative's name: "); // allows input of name and stores in variable rname
       while (!rname.matches("[a-zA-Z]+")) //while loop that will not allow non string values in variable name
        {
          rname = input("Please enter a valid name!: "); //after user types, loop is exited
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is their height in cm?");
          while (!scanner.hasNextInt()) //while user input is not a integer value
           {
             System.out.println("Please write a number.");
             scanner.nextLine(); //moves on to next piece of code after user has inputed value
           }
             int rheight = scanner.nextInt();//declares and initialises local variable rheight to only allow integer values

        Relative yourfamily = setRelative(rname, rheight); // calls the inputted values of relatives names and heights into setrelative which stores them into records which is returned and stored into variable yourfamily
        yourfamilys[i] = yourfamily; // stores current value of variable with the relatives name and height into next array
      }

      yourfamilys = bubbleSort(yourfamilys); //passes array yourfamilys through sorting method and stores returned sorted array to the same array (replace it)
    }
