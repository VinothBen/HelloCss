package com.cts.service;

import java.util.List;

import com.cts.vo.LoginVo;

public interface LoginService {
public String addLogin(LoginVo loginVo);
public List<LoginVo> getList(LoginVo loginVo);
}
