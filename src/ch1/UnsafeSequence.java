package ch1;

/**
 * @author weat0212@gmail.com
 * @project concurrency-control-java
 * @package PACKAGE_NAME
 * @date 2020/9/24 下午 01:14
 */
public class UnsafeSequence {
    private int value;

    public int getValue(){
        return value++;
    }
}
