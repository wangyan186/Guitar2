package com.pb.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
	// 创建静态全局变量
    static Connection conn;

    /* 获取数据库连接的函数*/
    public static Connection getConnection() {
        Connection con = null;  //创建用于连接数据库的Connection对象
        try {
            Class.forName("org.sqlite.JDBC");// 加载Sqlite数据驱动
             
            con = DriverManager.getConnection(
            		"jdbc:sqlite://d:/instrument.db");// 创建数据连接
             
        } catch (Exception e) {
            System.out.println("数据库连接失败" + e.getMessage());
        }
        return con; //返回所建立的数据库连接
    }

}
