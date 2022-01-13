package 자동차클래스상속예제;
/*
 * Car 클래스 => 부모 클래스 역할(상위)
 */
	public class Car {
	//객체가 가져야할 속성 =>현재 속도, 초기 값이 0이다. => 130 => 100
	protected int speed; //바퀴의 수
	protected int wheelNum; //자동차 이름, 초기 값 null이다. 정수0 실수0.0
	protected String carName;
	
	//디폴트(default)생성자 생성 // 상속을 시켜주면 디폴트를 생성해줘야 한다. 규칙이다.
	public Car() {
		
	}
	public Car(String name) {
		carName = name;
	}
	//생성자2
	public Car(int velocity) {
		speed = velocity;
	}
	//생성자3
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;	//생성자는 개발자가 언제든지 만들 수 있다.
	}
}
