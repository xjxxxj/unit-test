package xjx.study.demo.unit.test.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticTool.class)
public class StaticMockTest {

    @Before
    public void before() {
        PowerMockito.mockStatic(StaticTool.class);
        PowerMockito.when(StaticTool.say()).thenReturn("I'm power mock");
    }
    @Test
    public void testSay() {
        System.out.println(StaticTool.say());
    }

}
