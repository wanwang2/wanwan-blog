package test.wei.blog.account.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.wei.blog.account.dao.AccountDao;
import org.wei.blog.util.Log;

import test.wei.blog.AppTest;

public class AccountDaoTest extends AppTest {

	@Resource
	private AccountDao accountDao;
	
	@Test
	public void testDao(){
		List<Map<String, Object>> list = accountDao.getAccount("caocao", "123456");
		Log.log(list);
	}
}
