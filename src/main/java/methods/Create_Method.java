package methods;
//A method is a block of code which only runs when it is called.
//You can pass data, known as parameters, into a method.
//Methods are used to perform certain actions, and they are also known as functions.
//Why use methods? To reuse code: define the code once, and use it many times.
public class Create_Method {
    static void thisMethod(){
        //thisMethod() is the name of the method
        //static means that the method belongs to the Main class and not an object of the Main class
        //void means that this method does not have a return value
        System.out.println("Hurry up and wait");
    }
    //To call a method write the method's name followed by two parentheses () and a semicolon;
    //
    //In the following example, this.Method() is used to print a text (the action), when it is called
    public static void main(String[] args) {
        thisMethod();
        //To call a method more than once just re-state your method like below
        thisMethod();
        thisMethod();
        thisMethod();
    }
}
