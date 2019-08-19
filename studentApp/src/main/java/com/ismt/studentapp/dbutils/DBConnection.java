/**
 *
 */
package com.ismt.studentapp.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ZERO BYTE
 *
 */
public class DBConnection {

    private Connection conn = null;
    private PreparedStatement stmt = null;
    private final String classname = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/studentdb";
    private final String dbUser = "root1";
    private final String dbPass = "root";

    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName(classname);
        conn = DriverManager.getConnection(url, dbUser, dbPass);
    }

    public PreparedStatement initStatement(String sql) throws SQLException {
        stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        return stmt;

    }

    public ResultSet query() throws SQLException {
        return stmt.executeQuery();
    }

    public int update() throws SQLException {
        return stmt.executeUpdate();
    }

    public int getInsertId() throws SQLException {
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
        conn = null;
        stmt = null;
    }
}
