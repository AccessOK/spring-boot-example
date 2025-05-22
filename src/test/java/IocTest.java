import org.accessok.Main;
import org.accessok.modules.service.IUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {IocTest.class, Main.class})
public class IocTest {
    @Autowired
    private IUser user;
    @Test
    public void test() {
        try {
            user.getUserName("asddsasd");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
