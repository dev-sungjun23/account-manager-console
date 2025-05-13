import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    void 계좌_생성_테스트() {
        Account acc = new Account("유성준", 10000);
        assertEquals("유성준", acc.getOwner());
        assertEquals(10000, acc.getBalance());
    }

    @Test
    void 입금_정상_테스트() {
        Account acc = new Account("유성준", 5000);
        acc.deposit(3000);
        assertEquals(8000, acc.getBalance());
    }

    @Test
    void 출금_실패_테스트() {
        Account acc = new Account("유성준", 5000);
        acc.withdraw(6000);
        assertEquals(5000, acc.getBalance());
    }


}
