package ch1;

/**
 * @author weat0212@gmail.com
 * @project concurrency-control-java
 * @package ch1
 * @date 2020/9/24 下午 01:25
 */
public class test {
    public static void main(String[] args) {
        var test = new Sequence();
        System.out.println(test.getNext());
        System.out.println(test.getNext());
    }
}
