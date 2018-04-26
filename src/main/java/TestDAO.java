public class TestDAO {
    public static void main(String[] args) {
        SpringDAOImpl dao = new SpringDAOImpl();
        System.out.println(dao.list(1,10));
    }
}
