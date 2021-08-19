public class StaticVariableTest {
    public static String myVariable="class or static variable";

    public static void main(String[] args) {
        StaticVariableTest obj=new StaticVariableTest();
        StaticVariableTest obj2=new StaticVariableTest();
        StaticVariableTest obj3=new StaticVariableTest();

        System.out.println(obj.myVariable);
        System.out.println(obj2.myVariable);
        System.out.println(obj3.myVariable);
    }
}
