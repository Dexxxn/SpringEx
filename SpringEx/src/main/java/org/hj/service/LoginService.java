package org.hj.service;

import java.util.ArrayList;

import org.hj.model.LoginVO;

public interface LoginService {

	public void memreg(LoginVO member);

	public LoginVO login(LoginVO member);

	public ArrayList<LoginVO> memlist();

	// public LoginVO memview(String id);
	public LoginVO memview(LoginVO login);

	public void memberModify(LoginVO login);

	public void memberRemove(LoginVO login);
}
