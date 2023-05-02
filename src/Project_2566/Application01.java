package Project_2566;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		/*그림1 과 같이 9x9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
		 *  이들 중 최댓값을 찾고 그 최댓값이 몇행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		 *  예를 들어 다음과 같이 81개의 수가 주어지면 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.*/

	
	
	int [][] arr =new int[9][9]; //2차원 정변배열
	int max = 0; //최댓값 변수
	int x = 0; //i변수 열
	int y = 0; //j변수 행
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<arr.length; i++) { // i행 j열
		for(int j=0; j<arr.length; j++ ) {
			int num = sc.nextInt();
			arr[i][j] = num;
		}
	}
		sc.close();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
					x=i+1; // x는 1부터시작 i는 0부터시작
					y=j+1; // y는 1부터 시작 j는 0부터시작
				}
				
			}
		}
		System.out.println(max); //최댓값을 출력했을때
		System.out.println(x+" "+y); //행과 열값 출력
	}
	
	
	}

