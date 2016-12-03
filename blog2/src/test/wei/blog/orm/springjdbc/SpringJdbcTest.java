package test.wei.blog.orm.springjdbc;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.wei.blog.orm.springjdbc.SpringJdbc;
import org.wei.blog.util.Log;

import test.wei.blog.AppTest;

public class SpringJdbcTest extends AppTest{

	@Resource
	private SpringJdbc springJdbc;
	
	@Test
	public void testJdbc(){
		Log.log("jdbc:" + springJdbc.getJdbc());
	}
	
	@Test
	public void testSql(){
		String sql = "select * from b_account";
		List<Map<String, Object>> list = springJdbc.query(sql);
		Log.log("sql:" + list);
	}
}
