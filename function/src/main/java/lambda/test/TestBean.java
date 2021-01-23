package lambda.test;

import lambda.bean.Student;
import lambda.service.FilterService;
import lambda.service.impl.PersonFilterServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */
public class TestBean {

    public static void main(String[] args) {
        String[] name1 = {"w","c","k"};
        String[] name2 = {"w","c","k"};
        System.out.println(Objects.deepEquals(name1,name2));
        Objects.equals(1,2);
    }

    private static void test(String userName, Integer ... ids){
        Stream.of(ids).forEach(System.out::print);
    }

    private static void test1(Integer[] ids){

    }

}
