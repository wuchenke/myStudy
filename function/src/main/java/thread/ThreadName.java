package thread;

import java.util.concurrent.ThreadFactory;

/**
 * @author 64370
 * @Description
 * @Date 2021/1/25
 */
public class ThreadName {
    public static void main(String[] args) {

    }
}

class ThreadTest implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
