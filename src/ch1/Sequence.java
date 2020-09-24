package ch1;


import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * @author weat0212@gmail.com
 * @project concurrency-control-java
 * @package ch1
 * @date 2020/9/24 下午 01:22
 */
@ThreadSafe
public class Sequence {
    @GuardedBy("this")
    private int value;
    public synchronized int getNext(){
        return value++;
    }
}
