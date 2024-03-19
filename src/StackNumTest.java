import java.util.Scanner;

import static java.lang.System.*;

public class StackNumTest {
    public static void main(String[] args) {
        StackNum<Integer> num = new StackNum<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);
        num.push(5);
        out.println(num);
       num.stackOfNum();

    }
}
