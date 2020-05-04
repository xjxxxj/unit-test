package xjx.study.demo.unit.test.mockito;

public class StaticTool {

    public static String say() {
        String word = "This is say method of Tool class";
        System.out.println(word);
        return word;
    }

    public static String say(String name) {
        return "hello, " + name;
    }

}
