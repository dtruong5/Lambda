//Create a method which take a lambda expression as a parameter
interface StringFunction{
    String run(String str);
}
public class Lambda3 {
    public static void main(String[] args) {
        StringFunction exclamation = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclamation);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
