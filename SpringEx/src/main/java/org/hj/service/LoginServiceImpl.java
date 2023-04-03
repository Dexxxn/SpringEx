package org.hj.service;

import java.util.ArrayList;

import org.hj.mapper.LoginMapper;
import org.hj.model.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper lm;

	public void memreg(LoginVO member) {
		lm.memreg(member);
	};

	public LoginVO login(LoginVO member) {
		System.out.println("service=" + member);
		System.out.println("service return=" + lm.login(member));
		return lm.login(member);
	};

	public ArrayList<LoginVO> memlist() {
		return lm.memlist();
	};

	// public LoginVO memview(String id) {
	// return lm.memview(id);
	public LoginVO memview(LoginVO login) {
		return lm.memview(login);
	};

	public void memberModify(LoginVO login) {
		lm.memberModify(login);
	}

	public void memberRemove(LoginVO login) {
		lm.memberRemove(login);
	}
}
