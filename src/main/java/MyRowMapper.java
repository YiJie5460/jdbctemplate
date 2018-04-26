import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 实现RowMapper接口，返回User对象
 * */
public class MyRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
//        获取结果集中的数据
        String name = resultSet.getString("name");
        Long id = resultSet.getLong("id");
        // 把数据封装成Student对象
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        return student;
    }
}