package com.pb.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
	// ������̬ȫ�ֱ���
    static Connection conn;

    /* ��ȡ���ݿ����ӵĺ���*/
    public static Connection getConnection() {
        Connection con = null;  //���������������ݿ��Connection����
        try {
            Class.forName("org.sqlite.JDBC");// ����Sqlite��������
             
            con = DriverManager.getConnection(
            		"jdbc:sqlite://d:/instrument.db");// ������������
             
        } catch (Exception e) {
            System.out.println("���ݿ�����ʧ��" + e.getMessage());
        }
        return con; //���������������ݿ�����
    }

}
