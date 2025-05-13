import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountManagerTest {
    @Test
    void 계좌관리_생성_테스트() {
        AccountManager manager = new AccountManager();

        manager.createAccount("유성준", 10000);
        manager.createAccount("이영주", 5000);

        //then
        Account acc1 = manager.findAccount("유성준");
        assertNotNull(acc1, "유성준 계좌가 생성되어야 함");
        assertEquals("유성준", acc1.getOwner());
        assertEquals(10000, acc1.getBalance());

        Account acc2 = manager.findAccount("이영주");
        assertNotNull(acc2, "이영주 계좌가 생성되어야 함");
        assertEquals("이영주", acc2.getOwner());
        assertEquals(5000, acc2.getBalance());

        Account acc3 = manager.findAccount("홍길동");
        assertNotNull(acc3, "홍길동 계좌가 생성되어야 함");
        assertEquals("홍길동", acc3.getOwner());
        assertEquals(10000, acc3.getBalance());
    }

    @Test
    //존재하지 않는 사용자 이름으로 계좌를 검색하면 null이 반환되어야 한다.
    void 계좌관리_검색실패_테스트() {
        AccountManager manager = new AccountManager();

        manager.createAccount("유성준", 10000);

        Account Exist = manager.findAccount("유성준");
        Account notExist = manager.findAccount("이영주");

        assertNull(Exist, "없는 사용자를 검색했을 때 null이어야 함");
        assertNull(notExist, "없는 사용자를 검색했을 때 null이어야 함");
    }



}
