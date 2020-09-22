package jpabook.jpashop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpashopApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void ttTest() {
        String abc = "abc";
        System.out.println("abc = " + abc);
    }

}
