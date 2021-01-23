package lambda.service.impl;

import lambda.bean.Student;
import lambda.service.FilterService;

import java.util.Objects;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */
public class PersonFilterServiceImpl implements FilterService<Student,Integer> {

    //@Override
    public Student filterScore(Student student, Integer score) {
        if(Objects.nonNull(student) && student.getScore() > score){
            return student;
        }
        return null;
    }

    @Override
    public Student filterScore11(Student student, Integer integer) {
        return null;
    }
}
