package xjx.study.demo.unit.test.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class MockTest {

    @Mock
    private Tool tool ;


    @Test
    public void testSay() {
        when(tool.say()).thenReturn("I'm mock");
        System.out.println(tool.say());
        when(tool.say(anyString())).thenReturn("ok");
        System.out.println(tool.say("xxj"));
    }


}
