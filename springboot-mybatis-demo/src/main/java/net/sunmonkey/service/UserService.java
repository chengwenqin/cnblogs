package net.sunmonkey.service;

import net.sunmonkey.entity.UserEntity;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     * @return 用户实体列表
     */
    List<UserEntity> getAll();

    /**
     * 根据用户id获取一个用户信息实体
     * @param id 用户id
     * @return 用户实体
     */
    UserEntity get(String id);

    /**
     * 添加一个用户信息
     * @param userEntity 用户实体
     * @return 影响数据库的行数
     */
    int add(UserEntity userEntity);

    /**
     * 修改某个用户的信息
     * @param entity 用户实体
     * @return 影响数据库的行数
     */
    int modify(UserEntity entity);

    /**
     * 根据用户id删除一个用户信息
     * @param id 用户id
     * @return 影响数据库的行数
     */
    int delete(String id);
}
