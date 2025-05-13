/*
 * 시나리오
 * : 여러 명이 계좌를 만들 수 있어야 하고,
 *   이름으로 계좌를 찾아 입금/출금/조회할 수 있어야 한다.
 *
 * step 1 : 주체(객체) 나누기
 * 클래스               책임
 * Account             개별 계좌의 입출금, 조회
 * AccountManager      여러 개의 계좌를 생성/검색/관리
 *
 * 이렇게 역할에 따라 클래스를 분리하면 유지보수 쉬움. 근데 왜 나눔?
 * 아까는 Account 혼자서 다 하면 자연스럽다고 했잖아. 이거 질문.. -> no! 여러 개의 계좌 담당은 manager가 하는거
 *
 * step 2 : 어떤 기능이 필요한가?
 * 기능            메서드 이름(예시)
 * 계좌 생성        createAccount(String owner, int initialBalance)
 * 계좌 검색        findAccount(String owner)
 * 전체 계좌 출력    prinaAllAccounts()
 *
 * 게좌 관리는 전부 AccountManager가 담당하고,
 * 입출금은 여전히 Account가 스스로 처리하게 설계할 예정
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();

    //계좌 생성
    public void createAccount(String owner, int initialBalance) {
        Account account = new Account(owner, initialBalance);
        accounts.add(account);
        System.out.println(owner + "님의 계좌가 생성되었습니다.");
    }

    //계좌 검색
    public Account findAccount(String owner) {
        for(Account account:accounts) {
            if(account.getOwner().equals(owner)) {
                return account;
            }
        }
        System.out.println(owner + "님의 계좌를 찾을 수 없습니다.");
        return null;
    }

    //전체 계좌 출력
    public void printAllAccounts() {
        for (Account account:accounts) {
            account.printInfo();
        }
    }
}