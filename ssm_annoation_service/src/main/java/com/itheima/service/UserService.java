package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UserService {

    @Transactional(readOnly = false)
    public boolean save(User user);


    @Transactional(readOnly = false)
    public boolean update(User user);


    @Transactional(readOnly = false)
    public boolean delete(Integer uuid);

    @Transactional(readOnly = false)
    public User get(Integer uuid);

    @Transactional(readOnly = false)
    public PageInfo<User> getAll(int page, int size);

    @Transactional(readOnly = false)
    public User login(String userName, String password);
}
