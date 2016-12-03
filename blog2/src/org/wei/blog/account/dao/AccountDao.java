package org.wei.blog.account.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.wei.blog.orm.springjdbc.SpringJdbc;
import org.wei.blog.util.Log;

@Component
public class AccountDao {
	
	@Resource
	private SpringJdbc springjdbc;

	public List<Map<String, Object>> getAccount(String username, String password){
		String sql = "select * from b_account where username = ? and password = ?" ;
		List<Map<String, Object>> list = springjdbc.query(sql, new Object[]{username, password});
		return list;
	}
	
	/**
	 * 更新密码
	 * @param username
	 * @param password
	 */
	public int updatePassword(String username, String password){
		String sql = "update b_account set password = ? where username = ?" ;
		return springjdbc.getJdbc().update(sql, new Object[]{username, password});
	}
	
	@Transactional
	public int updatePasswordSql(String username, String password) throws Exception{
		String sql = "update b_account set password = '" + password
				+"' where username = '" + username
				+"'" ;
		Log.log(sql);
		springjdbc.getJdbc().update(sql);
		updateEmail(username, "66666666666666666666666666666666666666666666");
		return 0;
	}
	
	public int updateEmail(String username, String email) throws Exception{
		String sql = "update b_account set email = '" + email
				+"' where username = '" + username
				+"'" ;
		Log.log(sql);
		try {
			springjdbc.getJdbc().update(sql);
		} catch (Exception e) {
			throw new Exception("vvvv");
		}
		return 0;
	}
}
