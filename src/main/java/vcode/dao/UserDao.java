package vcode.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import vcode.domin.User;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user limit #{pageSize}")
    public List<User> select(int pageSize);

    @Select("select userid from user where username = #{username} and userpass = #{userpass}")
    public User selectByNameAndPass(String username, String userpass);

    @Insert("insert into user values(#{userid}, #{username},#{userpass},#{roleid})")
    public void insert(User user);

    @Delete("delete from user where userid = #{userid}")
    public void delete(String userid);

    @Select("select * from user where roleid = #{roleid} limit #{limit}")
    public List<User> selectByRole(@Param("roleid")String roleid, @Param("limit") int limit);


}
