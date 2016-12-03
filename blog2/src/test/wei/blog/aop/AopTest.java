package test.wei.blog.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wei.blog.aop.BlogServiceImpl;
import org.wei.blog.aop.BookServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:aop.xml" })
public class AopTest {

	@Autowired
    private BlogServiceImpl blogServiceImpl;  
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
    
	/**
	 * 测试正常调用  
	 */
	@Test
    public void testCall()  
    {    
		blogServiceImpl.getAuthor();  
		blogServiceImpl.getBlog(); 
		
		bookServiceImpl.getAuthor();  
		bookServiceImpl.getBlog(); 
    } 
}
