package net.sunmonkey.dao.mapper;

import net.sunmonkey.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@org.apache.ibatis.annotations.Mapper
public interface UserDao {

    List<UserEntity> selectAll();

    UserEntity selectByPrimaryKey(String id);

    int insert(UserEntity userEntity);

    int update(UserEntity userEntity);

    int delete(String id);
}
