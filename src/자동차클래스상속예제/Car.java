package �ڵ���Ŭ������ӿ���;
/*
 * Car Ŭ���� => �θ� Ŭ���� ����(����)
 */
	public class Car {
	//��ü�� �������� �Ӽ� =>���� �ӵ�, �ʱ� ���� 0�̴�. => 130 => 100
	protected int speed; //������ ��
	protected int wheelNum; //�ڵ��� �̸�, �ʱ� �� null�̴�. ����0 �Ǽ�0.0
	protected String carName;
	
	//����Ʈ(default)������ ���� // ����� �����ָ� ����Ʈ�� ��������� �Ѵ�. ��Ģ�̴�.
	public Car() {
		
	}
	public Car(String name) {
		carName = name;
	}
	//������2
	public Car(int velocity) {
		speed = velocity;
	}
	//������3
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;	//�����ڴ� �����ڰ� �������� ���� �� �ִ�.
	}
}
