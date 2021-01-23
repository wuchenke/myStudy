package codetest;


/**
 * @author 64370
 * @Description
 * @Date 2021/1/19
 */
public class CompareTest {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10; i++){
            s = s+i;
            sb.append(i);
        }
        System.out.println(sb);
    }
}
