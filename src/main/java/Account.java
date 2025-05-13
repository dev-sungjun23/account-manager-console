/*
 * 요구사항 정리
 * 사용자 이름과 초기 잔액으로 계좌를 만들고, 입금, 출금, 잔액 조회 기능이 가능해야 한다.
 *
 * step 1 : 요구사항을 "동사" 중심으로 정리
 * - 계좌를 만든다 -> 생성자 필요
 * - 입금할 수 있다 -> deposit()
 * - 출금할 수 있다 -> withdraw()
 * - 잔액을 확인할 수 있다 -> getBalance()
 * - 주인의 이름을 확인할 수 있다 -> getOwner()
 *
 * step 2 : 행동 주체는 누구??
 * -> 계좌가 스스로 처리하는 게 자연스러움.
 * "내가 가진 돈에서 출금하고, 입금도 받고, 내 잔액을 내가 안다."
 * 그래서 Account 라는 객체 하나가 상태와 행동을 모두 가지는 설계가 좋다.
 *
 * */


public class Account {

    //상태 (필드)
    private String owner; //계좌 주인 이름
    private int balance;  //잔액

    //생성자 : 계좌 생성 시 필수 정보 초기화
    public  Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //입금 기능
    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return;
        }

        balance += amount;
        System.out.println(amount + "원 입금 완료.");
    }

    //출금 기능
    public void withdraw(int amount) {
        if(amount <= 0) {
            System.out.println("출금 금액은 0보다 커야 합니다.");
            return;
        }
        if(amount > balance) {
            System.out.println("잔액 부족으로 출금할 수 없습니다.");
            return;
        }
        balance -= amount;
        System.out.println(amount + "원 출금 완료.");
    }

    //잔액 조회 기능
    public int getBalance() {
        return balance;
    }

    //계좌 주인 확인
    public String getOwner() {
        return owner;
    }

    //정보 출력(디버깅용 또는 콘솔 ui용)
    public void printInfo() {
        System.out.println(owner + "님의 계좌 | 잔액 : " + balance + "원");
    }
}
