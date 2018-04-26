package com.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 功能：通过JdbcTemplate实现查询操作
 * 查询结果需要自己封装(实现RowMapper接口)
 */

public class SpringDAOImpl implements DAO {
//xml里配置了数据库信息，从中读取生成JdbcTemplate对象。
    ApplicationContext ctx = new ClassPathXmlApplicationContext(
            new String[] {"applicationContext.xml"});
    JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

    public void add(Student student) {
        String sql = "INSERT INTO student (name) VALUES(?);";
        jdbcTemplate.update(sql, student.getName());
    }


    public void update(Student student) {
        String sql = "UPDATE student SET name = ? WHERE id  = ?;";
        jdbcTemplate.update(sql, student.getName(), student.getId());
    }


    public void delete(int id) {

        String sql = "DELETE FROM student WHERE id  = ?;";
        jdbcTemplate.update(sql, id);
    }


    public Student get(int id) {
        String sql = "select* FROM student WHERE id  = ?;";
        Student student = jdbcTemplate.queryForObject(sql, new MyRowMapper(), id);
        return student;
    }


    public List<Student> list() {
        return list(0, Short.MAX_VALUE);
    }


    public List<Student> list(int start, int count) {
        String sql = "select * from student order by id desc limit ?,?";
        List<Student> students = jdbcTemplate.query(sql, new MyRowMapper(), start, count);
        return students;
    }
}