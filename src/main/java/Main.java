import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* 기존 MAIN 코드
        AccountManager manager = new AccountManager();

        manager.createAccount("유성준", 10000);
        manager.createAccount("이영주", 5000);

        Account acc = manager.findAccount("유성준");
        if(acc != null) {
            acc.deposit(3000);
            acc.withdraw(2000);
            acc.printInfo();
        }

        System.out.println("--- 전체 계좌 목록 ---");
        manager.printAllAccounts();
        */

        /**************************************************************/
        /**************************************************************/
        /**************************************************************/

        /*메뉴 UI와 사용자 입력 처리 기능 추가
         * - 사용자에게 메뉴를 보여주고
         * - 숫자를 입력받아 기능을 실행
         * - 0번 입력 시 종료
         *
         * < 이 코드에서 연습되는 것 >
         *  - Scanner               사용자 입력 받기
         *  - while(true)           무한 반복 메뉴 구성
         *  - switch-case           입력된 번호에 따라 기능 분기
         *  - scanner.nextLine()    문자열 입력 처리
         *  - scanner.nextInt()     숫자 입력 처리(주의:줄바꿈 처리 필요)
         * */
        AccountManager manager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 잔액 조회");
            System.out.println("5. 전체 계좌 출력");
            System.out.println("0. 종료");
            System.out.println("번호를 입력하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //숫자 입력 후 줄바꿈 제거용

            switch (choice) {
                case 1: //계좌 생성
                    System.out.println("이름 : ");
                    String name = scanner.nextLine();
                    System.out.println("초기 입금액 : ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    manager.createAccount(name, amount);
                    break;

                case 2: //입금
                    System.out.println("입금할 계좌 이름 : ");
                    String depositName = scanner.nextLine();
                    Account depositAcc = manager.findAccount(depositName);
                    if(depositAcc != null) {
                        System.out.println("입금 금액 : ");
                        int depositAmount = scanner.nextInt();
                        scanner.nextLine();
                        depositAcc.deposit(depositAmount);
                    }
                    break;

                case 3: //출금
                    System.out.println("출금할 계좌 이름 : ");
                    String withdrawName = scanner.nextLine();
                    Account withdrawAcc = manager.findAccount(withdrawName);
                    if(withdrawAcc != null) {
                        System.out.println("출금 금액 : ");
                        int withdrawAmount = scanner.nextInt();
                        scanner.nextLine();
                        withdrawAcc.withdraw(withdrawAmount);
                    }
                    break;

                case 4: //잔액 조회
                    System.out.println("잔액 조회할 계좌 이름 : ");
                    String queryName = scanner.nextLine();
                    Account queryAcc = manager.findAccount(queryName);
                    if(queryAcc != null) {
                        queryAcc.printInfo();
                    }
                    break;

                case 5: //전체 계좌 출력
                    manager.printAllAccounts();
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다. ");
                    return;

                default:
                    System.out.println("잘못된 번호입니다.");
            }
        }
    }


}