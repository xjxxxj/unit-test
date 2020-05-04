package xjx.study.demo.unit.test.mockito.inject;

import com.sun.org.glassfish.gmbal.ManagedObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserServiceImpl.class)
public class InjectMockTest {

    @Mock
    private UserServiceImpl userService;

    @InjectMocks
    private UserController userController;

    private Map<String, Map<String, String>> userList = new HashMap<>();

    @Before
    public void before() {
        Map<String, String> user = new HashMap<>();
        user.put("name", "xxj");
        user.put("age", "24");
        userList.put(user.get("name"), user);
    }

    @Test
    public void testGetList() {
        Mockito.when(userService.getList()).thenReturn(userList);
        assertEquals(userController.getUserList(), userList);
    }

    @Test
    public void testPrivate() throws Exception {
        UserServiceImpl spy = PowerMockito.spy(new UserServiceImpl());
        // 注意，写成PowerMockito.when(spy, "doSomethingElse").thenReturn("xjx");的话，在mock时私有方法就会被调用了
        PowerMockito.doReturn("xjx").when(spy, "doSomethingElse") ;
        System.out.println(spy.getList());
        assertNotNull(spy.getList().get("xjx"));
    }

}
