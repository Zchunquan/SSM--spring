package com.fuqin.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	
//	props.load(new FileInputStream("db.properties")); 是读取当前目录的db.properties文件
//	getClass.getResourceAsStream("db.properties"); 是读取当前类所在位置一起的db.properties文件
//	getClass.getResourceAsStream("/db.properties"); 是读取ClassPath的根的db.properties文件,注意ClassPath如果是多个路径或者jar文件的,只要在任意一个路径目录下或者jar文件里的根下都可以,如果存在于多个路径下的话,按照ClassPath中的先后顺序,使用先找到的,其余忽略. 
	
	/**
	 * 根据key获取param.properties属性文件中的值
	 * @param key
	 * @return
	 * @author zcq
	 * @date 2017年11月21日 下午4:58:02
	 */
	public static String getValue(String key){
		PropertyUtil propertyUtil = new PropertyUtil();
		InputStream inputStream = propertyUtil.getClass().getClassLoader().getResourceAsStream("param.properties");  
        Properties properties = new Properties();  
        try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}  
        return properties.getProperty(key);
	}
	
	
}
