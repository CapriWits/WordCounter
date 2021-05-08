import org.junit.Test;

/**
 * @Description: 「正则表达式」测试
 * @Author: Hypocrite30
 * @Date: 2021/5/8 20:46
 */
public class RegexTest {
    @Test
    public void testRegex() {
        String ss = "  word1  ,  word2\r\n   word3,  word4";
        String s = ss.replaceAll("(\r\n|\n)", ",");
        System.out.println(s);
        String s1 = s.replaceAll("\\s+", "");
        System.out.println(s1);
    }
}
