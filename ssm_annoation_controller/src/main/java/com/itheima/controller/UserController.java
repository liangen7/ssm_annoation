package com.itheima.controller;


import com.github.pagehelper.PageInfo;
import com.itheima.controller.results.Code;
import com.itheima.controller.results.Result;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.system.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping
    public Result save(User user) {
        boolean save = userService.save(user);
        return new Result(save ? Code.SAVE_OK : Code.SAVE_ERROR);
    }

    @PutMapping
    public Result update(User user) {
        boolean update = userService.update(user);
        return new Result(update ? Code.UPDATE_OK : Code.UPDATE_ERROR);
    }

    @DeleteMapping("/{uuid}")
    public Result get(@PathVariable Integer uuid) {
        User user = userService.get(uuid);
        if (uuid == 10) {
            throw new
                    BusinessException("查询出错，请重试", Code.GET_ERROR);
        }
        return new Result(null != user ? Code.GET_OK : Code.SAVE_ERROR, user);
    }

    @GetMapping("/{page}/{size}")
    public Result getAll(@PathVariable Integer page, @PathVariable Integer size) {
        PageInfo<User> all = userService.getAll(page, size);
        return new Result(null != all ? Code.GET_OK : Code.GET_ERROR, all);
    }

    @PostMapping("/login")
    public Result login(String username, String password) {
        User login = userService.login(username, password);
        return new Result(null != login ? Code.GET_OK : Code.GET_ERROR, login);
    }
}
