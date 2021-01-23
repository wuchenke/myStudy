package lambda.enums;

import java.util.Objects;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */
public enum Score {

    /**
     * 低分
     */
    LOW(10, "低分"),
    /**
     * 中等
     */
    MIDDLE(50, "中等"),
    /**
     * 高分
     */
    HIGH(100, "高分");

    private Integer score;
    private String desc;

    Score(Integer score, String desc) {
        this.score = score;
        this.desc = desc;
    }

    public Integer getScore() {
        return score;
    }

    public String getDesc() {
        return desc;
    }

    private String getScoreDescByCode(Integer score){
        if(Objects.nonNull(score)){
            for(Score score1:Score.values()){
                if(Objects.equals(score,score1.getScore())){
                    return score1.getDesc();
                }
            }
        }
        return null;
    }
}
