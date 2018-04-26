import java.util.List;

public interface DAO {
    //增加
    public void add(Student student);
    //修改
    public void update(Student student);
    //删除
    public void delete(int id);
    //获取
    public Student get(int id);
    //查询
    public List<Student> list();
    //分页查询
    public List<Student> list(int start, int count);
}
