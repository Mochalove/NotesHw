package methods;
//Information can be passed to methods as parameter. Parameters act as variables inside the method.
//Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
public class Method_Parameters {
    static void myMethodz(String user, int age){
        System.out.println(user + " " + "is" + " " + age);
    }
    public static void main(String[] args) {
        myMethodz("Thomas", 45);
        myMethodz("Benson", 23);
        myMethodz("Darlene", 20);

    }
}
