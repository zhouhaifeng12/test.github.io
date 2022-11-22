package cn.tzz.dao.impl;

import cn.tzz.dao.IStudentDao;
import lombok.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class StudentDAOImpl implements IStudentDao{
    private DataSource dataSource;

    @Override
    public void save(String username, String password) throws Exception{
        @Cleanup
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO user(username,password) VALUES(?,?)");
        ps.setString(1, username);
        ps.setString(2, password);
        ps.executeUpdate();
    }
}
