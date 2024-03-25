package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ShopDao {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // JDBC 단계
    // 1. 드라이버 로드
    // - Class.forName() : try/catch
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 2. 커넥션 얻기
    public Connection getConnection() {
        Context initContext;
        try {
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
            con = ds.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    // 3. sql (CRUD) 작성

    // 4. 자원 정리
}
