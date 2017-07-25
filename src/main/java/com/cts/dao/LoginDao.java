package com.cts.dao;

import java.util.List;

import com.cts.vo.LoginVo;

public interface LoginDao {
public String addLogin(LoginVo loginVo);
public List<LoginVo> getList(LoginVo loginVo);
}
