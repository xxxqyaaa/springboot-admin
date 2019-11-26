package com.cxhello.admin.dao;

import com.cxhello.admin.entity.Role;
import com.cxhello.admin.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author CaiXiaoHui
 * @create 2019/11/10 12:41
 */
public interface UserDao extends Mapper<User> {

    List<User> findAllByLikeNickName(@Param("searchText") String searchText);

    List<Role> selectUserRoles(@Param("id") Integer id);
}
