package net.sunmonkey.service.impl;

import net.sunmonkey.dao.mapper.UserDao;
import net.sunmonkey.entity.UserEntity;
import net.sunmonkey.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<UserEntity> getAll() {
        return userDao.selectAll();
    }

    @Override
    public UserEntity get(String id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int add(UserEntity userEntity) {
        return userDao.insert(userEntity);
    }

    @Override
    public int modify(UserEntity entity) {
        return userDao.update(entity);
    }

    @Override
    public int delete(String id) {
        return userDao.delete(id);
    }
}
