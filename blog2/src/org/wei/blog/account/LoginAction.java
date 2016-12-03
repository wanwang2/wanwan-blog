package org.wei.blog.account;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.wei.blog.account.dao.AccountDao;
import org.wei.blog.util.Log;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Component
public class LoginAction extends ActionSupport{
	
	@Resource
	private AccountDao accountDao;
	
	private String username;
	private String password;
	
	public String login(){
		Log.log("login...");
		if(username != null && password != null){
			List<Map<String, Object>> list = accountDao.getAccount(username, password);
			if(list != null && list.size() > 0){
				return SUCCESS;
			}
		}
		return ERROR;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
