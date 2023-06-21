/*
Created by M.S.
Below you will find everything you need for the AP Computer Science A.
I am assuming that you learned these already. Use this as a refresher.
Feel free to comment out anything you dont want running.
I did not include:
 overriding toString() and equals()
 de Morgan rules
 compareTo()
You can check these out.
*/

import java.lang.Math;
import java.util.ArrayList;

public class App {
    //Primitive Types
    int number = 0;                 //Integer numbers.
    double decimal = 2.5;           //Any number, can be a decimal.
    char character = 'a';           //Any character. Must use ''.
    boolean logic = true;           //Logic state. Must be true or false.
    final int birthyear = 1830;     //Unchanable integer number.
    final double pi = 3.1415;       //Unchangable double number.
    final char nameinitial = 'A';   //Unchangable character.
    final boolean iscyclical = true;//Unchangable logic state.
    //Unprimitive Types 
    String word = "Unchangable"; //String are unchangable objects. creates a string object
    String word2 = new String("Static");
    String word3 = new String(word);
    Integer n = new Integer(2); //Creates an Integer object
    Double e = new Double(2.718); //Creates a Double object

    public static void main(String[] args) {
        App upper = new App();


        //Arithmetic Operators.
        //int operations.
        System.out.println(10 + 10); //Addition. Prints 20.
        System.out.println(10 - 10); //Subtraction. Prints 0.
        System.out.println(10 * 10); //Multiplication. Prints 100.
        System.out.println(10 / 10); //Division. Prints 1.
        System.out.println(10 % 10); //Modulus. Prints 0.
        
        //double operations. Note that even if the result is an integer, type is double.
        //when a double is used with an int, the result will be a double.
        System.out.println(10.5 + 10.5); //Addition. Prints 21.0.
        System.out.println(10.5 - 10.5); //Subtraction. Prints 0.0.
        System.out.println(10.5 * 10.5); //Multiplication. Prints 110.25.
        System.out.println(10.5 / 10.5); //Division. Prints 1.0.
        System.out.println(10.5 % 10.5); //Modulus. Prints 0.0.
        //----------------------------------------------------------------------------------------//
        
        //Increment and decrement operators.
        int x = 0;
        x++; //Increments the value of x by 1. X = 1
        x--; //Decrements the value of x by 1. X = 0
        x += 1; //Increases the value of x by 1. x = 1.
        x -= 1; //Decreases the value of x by 1. x = 0.
        System.out.println(x); //Prints the value 0.
        //----------------------------------------------------------------------------------------//
        //Math Class and methods.
        double abs = Math.abs(upper.e-upper.pi); // the absoulute value of e-pi
        int abs2 = Math.abs(upper.number); // the absoulute value of number (0)
        System.out.println(abs);
        System.out.println(abs2);
        double pow = Math.pow(upper.pi, upper.e); //here, pi is base while e is exponent pi^e
        System.out.println(pow);
        double sqrt = Math.sqrt(upper.pi); // the square root of pi
        System.out.println(sqrt);
        double random = Math.random(); //returns a random number (0,1). 
        System.out.println(random);
        int random2 = (int) Math.random()*10; //returns a integer random number (0,10).
        System.out.println(random2);

        //----------------------------------------------------------------------------------------//
        //Addition and substraction in Strings.
        String phrase = upper.word + " " +upper.word2;
        System.out.println(phrase); // prints out "Unchangable Static"
        //----------------------------------------------------------------------------------------//
       
        //Comparing strings 
        System.out.println(upper.word); //Prints out Unchangable
        System.out.println(upper.word2); //Prints out Static
        //Note that we had to use upper.word to call the word. Since word is not a static
        //Variable, we have to call it from an instance of the class.
        boolean sign = upper.word==upper.word3;
        boolean equal = upper.word.equals(upper.word3);
        System.out.println(sign); //this prints false, since == compares the addreses.
        System.out.println(equal); //this prints true, since the string values are the same.
        //So if we want to compare String or any other objects by their values and not their
        //addreses, we have to use .equals()
        String word4 = "Rosantha";
        String word5 = "Rosantha";
        System.out.println(word4==word5); 
        //Note that this here prints true, since we didnt construct a String, 
        //this is counted as a reference in the memory.
        String word6 = new String("Alpine");
        String word7 = new String("Alpine"); 
        System.out.println(word6==word7); 
        //this prints out false, since we constructed the String with the constructor.

        //----------------------------------------------------------------------------------------//
        //String Methods
        int wordlen = upper.word.length(); //word = Unchangable, so wordlen = 11.
        System.out.println(wordlen);
        String subword = upper.word.substring(2); //subword = changable returns substring
        String subbword = upper.word.substring(2,6); //subbword = unchan
        System.out.println(subword+subbword);
        int index = subword.indexOf("g"); //returns the smallest index starting with "g"
        System.out.println(index);
        //----------------------------------------------------------------------------------------//
        //Wrapper Class methods.
        int nval = upper.n.intValue(); //returns the int value of n
        int max = Integer.MAX_VALUE; //Max possible int  value
        int min = Integer.MIN_VALUE; //Min possible int value
        System.out.println(nval);
        System.out.println(max);
        System.out.println(min);
        double eval = upper.e.doubleValue(); //returns thed double value of e
        System.out.println(eval);

        //----------------------------------------------------------------------------------------//
        //If else statements. NOTE: GO STUDY DEMORGAN RULES !! I WONT WRITE THEM HERE!!!!
        //An if statement determines wheter the argument passed in it is true or not.
        //if its true, it runs the statement.
        boolean state = true;
        if(state) { // since state is true, 
            System.out.println("The statement is true."); //this line will print
        } else if(1>0) { // this segment wont run, even if 1>0, since this is an else if
            System.out.println(upper.pi); // and a continuation of the first if.
        }
        if(1>0) { //this if will run regardless.
            System.out.println("Yes, one is bigger than zero");
        }

        //----------------------------------------------------------------------------------------//
        //comparing objects
        Person Amir = upper.new Person("Amir", 12);
        Person Bora = upper.new Person("Amir", 12);
        Person Dagkhan = Amir;
        Person Cem; 
        //In this case, Amir and Bora have the same values, but refer to differnt addreses at the
        //memory. Dagkhan has the same addres as Amir,Dagkhan is an alias of Amir. 
        //Cem is null.
        System.out.println(Amir==Bora); //prints false
        System.out.println(Amir.equals(Bora)); //prints true
        System.out.println(Amir==Dagkhan); //prints true
        
        //----------------------------------------------------------------------------------------//
        //while loops
        boolean condition = false;
        int counter = 0;
        while(condition==false) { // a while loop loops until the condition is not satisfied.
            if(counter==20) { //in this case it looped twenty times,
                condition = true; // and changed condition to true, 
            } //which caused the loop to stop.
            counter++;
        }
        System.out.println(counter);

        //----------------------------------------------------------------------------------------//
        //for loops
        int counter2 = 0;
        for(int i = 0;i<100;i++) { //this for loop iterates untill i = 99.
            if(i%2==0) { //if i is even, add 1 to counter2.
                counter2++;
            }
        }
        System.out.println(counter2); //prints the amount of even numbers.

        //----------------------------------------------------------------------------------------//
        //Enhanced for loops
        int[] numbers =  {12,12,34,234,234,123,123,542335,123521};
        int sum = 0;
        for(int num: numbers) { //an enhanced for loop iterates thru every element of an array
            sum += num; // or any other iterable object like ArrayList.
        } 
        System.out.println(sum); //prints the sum of array numbers.

        //----------------------------------------------------------------------------------------//
        //Arrays
        //Arrays are multi dimensional data types. So we can store multiple data in one.
        //Arrays have indexes that basically give numbers to each data it holds.
        //Array indexes start at 0. So the index of the first element is 0.
        int[] newArray = new int[10]; //an array with the size 10. Array sizes cant be changed
        String[] strArray = new String[10]; //A string array with the size 10
        boolean[] boolArray = new boolean[10]; //A boolean array with the size 10
        for(int i = 0; i < newArray.length;i++) { //traversing through the array
            newArray[i] = i; //setting the ith element to i
            strArray[i] = "a"; //setting the ith element to "a"
            boolArray[i] = true; //setting the ith element to true
        } //note that .length has no ().
        System.out.println(newArray[4]);//acceses and prints the 5th element of the array. 
        //Notice how since index starts at 0, index 4 is the fifth item.
        //we can create array of any type. Even as objects of other classes.
        //----------------------------------------------------------------------------------------//
        //Multidimensional Arrays
        //Arrays can store a multitude of things, and that includes other arrays.
        //You can use 2 dimensional arrays in a lot of ways.
        int[][] newMatrix = {{1,2,3},{4,5,6},{7,8,9}}; // creates a 2 dimensional array named newMatrix.
        for(int i=0;i<newMatrix.length;i++) {
            for(int j=0;j<newMatrix[i].length;j++) {
                System.out.println(newMatrix[i][j]); //prints out the matrix element at i,j
            }
        }
        //We can use enhanced for loops in multidimensional arrays
        for(int[] i:newMatrix) {
            for(int j:i) {
                System.out.println(j); //another way to print the matrix element at i,j
            }
        }
        //----------------------------------------------------------------------------------------//
        //Arraylist 
        //Arraylists are basically resizable arrays.
        ArrayList<Integer> newlist = new ArrayList<Integer>(); //you can make arraylists any type
        //ArrayLists are dynmaci dataypes, youy can change their sizes at any time.
        newlist.add(5); //adds the eleement 5 to tyhe arraylist
        newlist.add(10); //adds the element 10 to the arraylist
        newlist.add(0, 1); //adds element 1 at index 0
        newlist.remove(0); //removes the element at index 0
        newlist.set(1,6); //sets element at index 1 to 6
        newlist.get(1); //returns the element at index 1
        int newlist_size = newlist.size(); //returns the size of arraylist
        System.out.println(newlist_size); //prints the size of arraylist
        for(Integer i:newlist) { //loops through the Arraylist
            System.out.println(i);
        }


        //----------------------------------------------------------------------------------------//
        //M is an instance of Person which is a class of App
        Person M = upper.new Person("M. Wolf",21);
        //Prints M name.
        System.out.println(M.getName());
        //Prints M age.
        System.out.println(M.getAge());
        //Prints whether M is an adult.
        System.out.println(M.getIsAdult());

        Student A = upper.new Student("Amir",21,2023,12,1953);
        System.out.println(A.getName()); // get name method is from Person
        System.out.println(A.getGradYear()); //get gradyear method is from Student
        Person B = upper.new Student("Bağhan",12,2041,3,1342);
        //IMPORTANT NOTE!!!
        //SINCE OBJECT B IS FIRTS CREATED BY PERSON, THE COMPILER THINKS OF IT AS A PERSON
        //OBJECT. SO YOU ARE NOT ABLE TO CALL METHODS OF THE STUDENT CLASS.
        //IF YOU USE DOWNCASTING, AS I DID BELOW, YOU CAN CALL THE STUDENT METHODS.
        //THE COMPILER REQUIRES YOU TO USE THE METHODS OF PERSON, HOWEVER WHEN THE CODE RUNS
        //IT WILL USE THE CORRESPONDING METHODS IN STUDENT CLASS!!!
        //How to downcast: ((lowerclass)obj).methodofsuper()
        System.out.println(((Student)B).getGradYear());
        System.out.println(B.getName());  //prints Student Bağhan
        //In the above example, getName was a method of Person and a method of Student.
        //Even though B was a Person instance, when the code runs the methods of subclass
        //Student are used, so this statement printed "Student Bağhan"
        
        //Student C = upper.new Person("Bora", 20); This will not work as 
        //Student is a subclass of Person. 
        //----------------------------------------------------------------------------------------//


    }

    //----------------------------------------------------------------------------------------//
    //Methods
    //Think of methods as functions from your math class. They take variables 
    // (or sometimes dont take variables) and do stuff.
    //A void method does not return any value.
    public static void hello() { //there is no input value for this method.
        System.out.println("Hello"); // method simply prints out Hello.
    }
    //A simple factorial method which is recursive. Note that it returns an int type value.
    public static int factorial(int n) { //Input value is n.
        if(n==1) {
            return 1;
        }
        return(n*factorial(n-1));
    }
    //both of these methods were static which means it is called by itself without reference to
    //any instance variables. For example, if upper is an object of class App,
    //we dont need to call the factorial method as upper.factorial(n), since factorial is a 
    //static method. 
    //----------------------------------------------------------------------------------------//


    // A class named Person.
    public class Person {
        //The class Person has 3 variables.
        private String name; //Name of the person
        private int age; //Age of the person
        private boolean isAdult; //Wheter the person is an adult or not.

        //Constructor of Person, takes two parameters.
        public Person(String n,int a) {
            name = n; //Sets the object name to n.
            age = a; //Sets the object age to a.
            if(age>=18) { //Determines if the person is an adult or not.
                isAdult = true;
            } else {
                isAdult = false;
            }
        }
        
        public Person(String n) { // an overloaded constructor, which just takes the name.
            name = n;
            age = 0; // the Persons age is set to 0
            isAdult = false; // and isAdult is false.
        }
        
        //Since name is private, we need a method to return its value.
        public String getName() { //this method is not static, so it needs a instance of Person.
              return name;
        }
        //Since age is private, we need a method to return its value.
        public int getAge() { //this method is not static, so it needs a instance of Person.
              return age;
        }
        //Since isAdult is private, we need a method to return its value.        
        public boolean getIsAdult() { //this method is not static, so it needs a instance of Person.
              return isAdult;
        }
        //Since name is private, to change it we need a mutator method.
        public void nameChange(String n) {
              this.name = n;
        }
        //Since age is private, to change it we need a mutator method.
        public void addAge(int a) {
              this.age += age;
            if(age>=18) { //Determines if the person is an adult or not.
                isAdult = true;
            } 
        }
    }

    public class Student extends Person { //class Student is a subclass of Person

        private int gradYear;
        private int grade;
        private int studentId;
        
        public Student(String n, int a, int gY,int g, int sI) {
            super(n, a); //We use the constructor avaiable in Person here
            gradYear = gY; // we define variable special to Student class
            grade = g;
            studentId = sI;
        }
        //Since gradYear is private, we need a method to return its value.
        public int getGradYear() {
              return gradYear;
        }
        //Since grade is private, we need a method to return its value.
        public int getGrade() {
              return grade;
        }
        //Since studentId is private, we need a method to return its value.
        public int getStudentId() {
              return studentId;
        }
        @Override
        public String getName() {
            return "Student "+super.getName(); //overridden method
        }
        //Since studentId is private, to change it we need a mutator method.
        public void setStudentId(int studentId) {
              this.studentId = studentId;
        }
        @Override // we override the method to add the years to the grade.
        public void addAge(int a) {
              super.addAge(a); // we use the addAge method from Person
              grade += a;
        }
        
    }


}   

    
