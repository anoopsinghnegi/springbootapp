import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MessageService.class)
public class MessageServiceTest {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
        @Test
        public void testMessage2() {
                MessageService ms = new MessageService();
                System.out.println("bingo");
                Assertions.assertEquals(ms.bingo(), "bingo");
        }
        @Test
        public void testMessage3() {
                MessageService ms = new MessageService();
                System.out.println("devops");
                Assertions.assertEquals(ms.devops(), "devops");
        }
        @Test
        public void testMessage4() {
                MessageService ms = new MessageService();
                System.out.println("failedpositive");
                Assertions.assertNotEquals(ms.bingo(), "failed");
        }
        @Test
        public void testMessage5() {
                MessageService ms = new MessageService();
                System.out.println("failedpositive2");
                Assertions.assertNotEquals(ms.sayHello(), "failed");
        }
        @Test
        public void testMessage6() {
                //MessageService ms = new MessageService();
                System.out.println("dummy");
                //Assertions.assertEquals(ms.sayHello(), "hello");
        }
        @Test
        public void testMessage7() {
        }
        @Test
        public void testMessage8() {
               Assertions.assertTrue(true);
        }
        @Test
        public void testMessage9() {
               Assertions.assertFalse(false);
        }
        @Test
        public void testMessage10() {
               Assertions.assertFalse(false);
        }
//resloved merging of rel2 with master
}
