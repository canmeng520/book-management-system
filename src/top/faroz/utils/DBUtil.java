package top.faroz.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName DBUtil
 * @Description 数据库工具类
 * @Author FARO_Z
 * @Date 2020/11/13 3:42 下午
 * @Version 1.0
 **/
public class DBUtil {

    private static final String url="jdbc:mysql://175.178.164.150:3306/book_management_db?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    private static final String name="root";
    private static final String password="feizhou@123";

    /**
     * 静态代码块
     * 注入JDBC连接
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得JDBC连接
     * @return 连接Connection conn
     */
    public static Connection getConnection() {
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(url, name, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

}
