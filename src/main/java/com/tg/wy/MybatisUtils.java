package com.tg.wy;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tgwy.entity.User;
import com.tgwy.res.MybatisRes;

public class MybatisUtils {
	
	public MybatisUtils(){
		
	}
	

	// 执行查询返回一个唯一user对象的sql
	public static User getUser() {

		String statement = "com.tgwy.entity.selectUserByID";// 映射sql的标识字符串
		User user = new MybatisRes().getSession().selectOne(statement, 1);
		return user;
	}

}
