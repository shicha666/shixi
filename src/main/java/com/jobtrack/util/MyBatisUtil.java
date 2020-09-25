/*
 * Copyright(c) 2020. YCHS All Rights Reserved.
 */
package com.yckj.jobtrack.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Function:  MyBatisUtil工具类        <br>
 * @author shengyuee  <br>
 * @version 1.0 2020年6月4日
 * 
 */
public class MyBatisUtil {
	private static InputStream inputStream = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	// 读取资源配置文件，只执行一次
	static {
		String resource = "mybatis-config.xml";
		try {
			// 1.读取资源配置文件
			inputStream = Resources.getResourceAsStream(resource);
			// 2.创建SqlSessionFactory对象
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 获取SqlSession对象
	 * @return
	 */
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	
	/**
	 * 关闭连接，释放资源
	 * @param sqlSession
	 */
	public static void close(SqlSession sqlSession) {
		sqlSession.close();
	}
}
