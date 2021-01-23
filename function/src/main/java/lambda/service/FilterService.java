package lambda.service;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/17
 */
@FunctionalInterface
public interface FilterService<T,S> {

    /**
     * 根据分数过滤
     * @param t object
     * @param s score
     * @return T
     */
    T filterScore11(T t, S s);
}
