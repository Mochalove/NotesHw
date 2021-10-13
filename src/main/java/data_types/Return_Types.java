package data_types;
//The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
public class Return_Types {
    static int myMethodd(int n){
        return 6 + n;
    }
    public static void main(String[] args) {
        System.out.println(myMethodd(7));
    }
}
