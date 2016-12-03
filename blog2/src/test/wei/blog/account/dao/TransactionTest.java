package test.wei.blog.account.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wei.blog.account.dao.AccountDao;
import org.wei.blog.util.Log;

/**
 * spring事务测试
 * @author Administrator
 *
 */  
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = { "classpath:dao.xml" })
public class TransactionTest extends AbstractJUnit4SpringContextTests {
	
	@Resource
	private AccountDao accountDao;
	
	@Test
	public void testDao() throws Exception{
		int r = accountDao.updatePasswordSql("liubei", "666666"); 
		Log.log(r);
	}
}
