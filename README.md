# non-overlapppingNumbers

#  겹치지 않는 숫자 10개 입력 받기
사용자에게 1부터 100사이의 숫자를 10개 입력받아 이를 순서대로 출력해라. 단, 사용자가 입력하는 동안 이미 입력한 숫자와 같은 숫자를 입력하면 "잘못 입력하였습니다. 다시 입력하세요."라는 문구와 함께 다시 입력받도록 해라. 입력이 완료되면 10개의 수를 모두 출력해라. 

변수는 다음과 같이 사용 

int number[] = new int[10];// 사용자가 입력한 숫자 10개 

int newnum; // 입력받은 숫자 

int count; // 현재까지 입력된 숫자의 개수(0~10) 

boolean dup; // 중복검사 통과 여부 (true : 중복, false : 중복없음) 

int i; // 반복문을 위한 변수

실행 결과
```
Enter a number from 1 to 100
Enter 1th number > 1
Enter 2th number > 1
Invalid input!
Enter 2th number > 2
Enter 3th number > 4
Enter 4th number > 6
Enter 5th number > 4
Invalid input!
Enter 5th number > 2
Invalid input!
Enter 5th number > 7
Enter 6th number > 10
Enter 7th number > 35
Enter 8th number > 10
Invalid input!
Enter 8th number > 23
Enter 9th number > 43
Enter 10th number > 35
Invalid input!
Enter 10th number > 35
Invalid input!
Enter 10th number > 33
1th number is 1
2th number is 2
3th number is 4
4th number is 6
5th number is 7
6th number is 10
7th number is 35
8th number is 23
9th number is 43
10th number is 33
```