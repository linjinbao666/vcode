import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vcode.dao.UserDao;
import vcode.domin.User;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    public void testUser1(){
        List<User> list = userDao.getUserList();
        for (User u: list){
            System.out.println(u);
        }
    }

    @Test
    public void testUser2(){
        User us = new User();
        UUID uuid = new UUID(34,45);
        us.setUserid(uuid.toString());
        us.setUsername("ljbao");
        us.setUserpass("11111");
        us.setRoleid("2");
        userDao.insert(us);

    }
}
