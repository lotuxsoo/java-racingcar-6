# 2주차: 자동차 경주 게임

## ✅ 기능 소개

### 게임 설명
- 자동차의 이름과 경주 횟수를 입력받아 최종 우승자를 보여주는 초간단 자동차 경주 게임

### 구현할 기능 목록
- 게임 시작 기능
- 자동차의 이름을 입력 받는다.
  - `[예외]` 자동차 이름이 5자 이하가 아닌 경우
  - `[예외]` 자동차 이름이 쉼표로 구분되지 않은 경우
  - `[예외]` 자동차 이름이 중복된 경우
- 경주를 시도할 횟수를 입력 받는다.
  - `[예외]` 숫자가 아닌 입력을 받은 경우
- 각 자동차를 랜덤 숫자만큼 이동시킨다.
  - `[조건]` 0~9 사이의 랜덤 숫자 중 4 이상일 때 전진
- 각 라운드마다 전진시킨 결과를 출력한다.
- 모든 라운드가 끝나면 최종 우승자를 발표한다.
  - `[조건]` 최종 우승자가 여러명이면 쉼표로 구분하여 출력
  - `[조건]` 전진한 자동차가 없는 경우 '최종 우승자가 없습니다!' 문구 출력
- 게임 종료 기능

### 파일 구조
```bash
├── Application.java
│ 
├── controller
│   └── Game.java
│ 
├── model
│   ├── Car.java
│   ├── Cars.java
│   ├── Name.java
│   ├── Position.java
│   └── RandomNumber.java
│ 
└── view
    ├── InputView.java
    └── OutputView.java
```

---

## ✅ 체크리스트

| - | 기능 요구사항                                                                      |
|---|------------------------------------------------------------------------------|
| ✔ | 게임 시작 문구 출력                                                                  |
| ✔ | 사용자에게 n대의 자동차 이름을 입력받음                                                       |
| ✔ | 입력: `camp.nextstep.edu.missionutils.Console`의 `readLine()` 사용                |
| ✔ | 자동차 이름이 쉼표로 구분되었는지 확인                                                        |
| ✔ | 쉼표로 구분되어 있지 않으면 `IllegalArgumentException` 발생하고 종료                           |
| ✔ | 구분된 자동차 이름이 각자 5자 이하인지 확인                                                    |
| ✔ | 5자 이하가 아닌 경우 `IllegalArgumentException` 발생하고 종료                              |
| ✔ | 시도할 횟수 문구 출력                                                                 |
| ✔ | 사용자에게 시도 횟수 n번을 입력받음                                                         |
| ✔ | 숫자가 아닌 입력을 받은 경우 `IllegalArgumentException` 발생하고 종료                          |
| ✔ | 실행 결과 문구 출력                                                                  |
| ✔ | Random 값: `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()` 사용 |
| ✔ | Random 값은 0~9 사이의 숫자이고, 4 이상일 때만 전진시킴                                        |
| ✔ | 각 차수별 실행 결과를 보여줄 때 자동차 이름과 전진 정도를 '-'로 출력     |
| ✔ | 최종 우승자 문구 출력                                                                 |
| ✔ | 최종 우승자가 여러 명인 경우 쉼표로 구분하여 출력                                                 |

<br>