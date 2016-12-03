package org.wei.blog.orm.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class SpringJdbc {

	@Resource(name = "jdbcTemplate")
	protected JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc(){
		return this.jdbc;
	}
	
	public void query(){
		
	}
	
	public List<Map<String, Object>> query(String sql, Object... args) {
		List<Map<String, Object>> list = jdbc.queryForList(sql, args);
		return list;
	}
	
	/**
	 * 查询所有的数据
	 * @param sql
	 * @return
	 */
	public List<Map<String, Object>> query(String sql) {
		List<Map<String, Object>> list = jdbc.queryForList(sql);
		return list;
	}
	
	public List<String> query(String sql, String field) {
		final String fieldz = field;
		List<String> list = jdbc.query(sql, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(fieldz);
			}

		});
		return list;
	}
}
