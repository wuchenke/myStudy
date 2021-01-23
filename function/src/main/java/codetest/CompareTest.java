package codetest;


/**
 * @author 64370
 * @Description 字符串拼接测试，使用 String + 的方式拼接字符串，每次都会生成一个 StringBuilder 对象，并调用 StringBuilder
 * 对象的 append 方法，最后以 toString 的方式返回。
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
