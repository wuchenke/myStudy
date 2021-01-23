package codetest;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/20
 */
public class DateTest {
    public static void main(String[] args) throws InterruptedException {
        int day = LocalDate.of(2021,1,1).lengthOfYear();
        System.out.println(day);
    }
}
