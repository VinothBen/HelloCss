package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.LoginDaoImpl;
import com.cts.vo.LoginVo;

@Service

public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDaoImpl loginDaoImpl;

	public String addLogin(LoginVo loginVo) {

		String name = loginDaoImpl.addLogin(loginVo);
        return name;
	}

	public List<LoginVo> getList(LoginVo loginVo) {
		List<LoginVo> list=loginDaoImpl.getList(loginVo);
		return list;
	}

}
