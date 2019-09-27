package vcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vcode.dao.UserDao;
import vcode.domin.User;

import java.util.List;

@Service()
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询用户列表
     * @param pageSize
     * @return
     */
    public List getUserList(int pageSize){
        return userDao.select(pageSize);
    }

    /**
     * 根据角色条件查询
     * @param roleId
     * @param limit
     * @return
     */
    public List getUserListByRole(String roleId,int limit){
        return userDao.selectByRole(roleId,limit);
    }

    /**
     * 用户登录校验
     * @param username
     * @param userpass
     * @return
     */
    public boolean login(String username, String userpass){
        if (username==null || userpass== null) return false;
        if (userDao.selectByNameAndPass(username,userpass)!=null) return true;
        return false;
    }

    /**
     * 新增用户
     * @param user
     */
    public void addUser(User user){
        if (user==null) return;
        userDao.insert(user);
    }

    /**
     * 删除用户
     * @param userid
     */
    public void delUser(String userid){
        if (userid==null) return;
        userDao.delete(userid);
    }

}
