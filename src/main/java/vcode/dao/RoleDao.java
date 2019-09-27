package vcode.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import vcode.domin.Role;

import java.util.List;

/**
 * 角色
 */
@Repository
public interface RoleDao {

    //查询角色 所有
    @Select("select * from role")
    public List<Role> selectAll();

    @Select("select * from role")
    public Role slect();

    @Update("update role set ")
    public void update(Role role);

    @Insert("")
    public void insert(Role role);

    @Delete("")
    public void delete(String roleid);
}
