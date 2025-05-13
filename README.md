# 💰 계좌 관리 콘솔 프로그램 (Account Manager Console App)

자바 객체지향 설계를 연습하며 만든 콘솔 기반 계좌 관리 프로그램입니다.  
입금, 출금, 잔액 조회 등 기본적인 은행 계좌 기능을 구현하고, 단위 테스트를 통해 기능을 검증했습니다.

---

## 📌 주요 기능

- 계좌 생성 (사용자 이름, 초기 입금액)
- 계좌 검색 (이름으로 조회)
- 입금 / 출금
- 잔액 조회
- 전체 계좌 목록 출력
- 콘솔 메뉴 UI로 사용자와 상호작용

---

## ⚙️ 기술 스택

- Java 17  
- IntelliJ IDEA  
- Gradle  
- JUnit 5  
- Git / GitHub  

---

## 🧪 테스트 코드

- `AccountTest.java`: 개별 계좌의 입금, 출금, 잔액 확인
- `AccountManagerTest.java`: 계좌 생성 및 검색 기능 테스트

---

## ▶️ 실행 방법

1. 프로젝트를 IntelliJ로 열기  
2. `Main.java` 실행  
3. 콘솔에 나오는 메뉴를 따라 계좌를 관리할 수 있음

---

## 📂 디렉토리 구조 예시

<pre> <code> AccountManagerWithTests/ ├── src/ │ ├── main/java/ │ │ ├── Account.java │ │ ├── AccountManager.java │ │ └── Main.java │ └── test/java/ │ ├── AccountTest.java │ └── AccountManagerTest.java ├── build.gradle └── README.md </code> </pre>

---

## ✍️ 개발 목표

- 자바 객체지향 기본기를 실습으로 체득
- 기능을 명확하게 나누는 클래스 설계 훈련
- 테스트 코드와 함께 기능 검증 경험
