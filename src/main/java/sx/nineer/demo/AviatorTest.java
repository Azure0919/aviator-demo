package sx.nineer.demo;

import com.googlecode.aviator.AviatorEvaluator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author psx
 * @date 2020/9/16 19:26
 * @description: Aviator测试
 * @version: V1.0
 * @since 1.0
 **/

public class AviatorTest {

  public static void main(String[] args) {
    /*Long result = (Long) AviatorEvaluator.execute("1+2+3");
    System.out.println(result);

    String yourName = "Michael";
    Map<String, Object> env = new HashMap<String, Object>();
    env.put("yourName", yourName);
    String result1 = (String) AviatorEvaluator.execute(" 'hello ' + yourName ", env);
    System.out.println(result1);  // hello Michael

    String name = "dennis";
    Object exec = AviatorEvaluator.exec(" 'hello ' + yourName ", name);// hello dennis
    System.out.println(exec);*/

    Object execute = AviatorEvaluator.execute("string.length('hello')");// 5
    System.out.println(execute);

  }

}
