package lambda.bean;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */

public class Student extends Person{

    private Integer score;

    public Student() {
    }

    public Student(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                "} " + super.toString();
    }
}
