import com.yy.annotation.LogAspect;
import com.yy.annotation.TestAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.HashSet;


@ContextConfiguration(locations="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MainTest {

    @Autowired
    TestAnnotation testAnnotation;

    @Test
    public void test() {
        // 👌
        testAnnotation.hah777(null, 10);

        testAnnotation.resulttest777("123", 123999);

        testAnnotation.hah777(null, 11);
        testAnnotation.hah777("aasdaf", 12);

        LogAspect.stat();
    }
}
