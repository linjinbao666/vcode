package vcode.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import vcode.domin.User;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user")
    public List<User> getUserList();

    @Insert("insert into user values(#{userid}, #{username},#{userpass},#{roleid})")
    public void insert(User user);

}
