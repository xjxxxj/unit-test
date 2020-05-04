package xjx.study.demo.unit.test.mockito;

public class Tool {


    public Tool() {
    }

    public String say() {
        String word = "This is say method of Tool class";
        System.out.println(word);
        return word;
    }

    public String say(String name) {
        return "hello, " + name;
    }

}
