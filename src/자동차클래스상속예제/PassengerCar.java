package �ڵ���Ŭ������ӿ���;

/*
 * �¿���(PassengerCar) Ŭ����  => �ڽ�(����) Ŭ���� ����
 */

public class PassengerCar extends Car {  //�ڽ�Ŭ�����̸� extends �θ�Ŭ�����̸�
	//[�߿�] ������ ������ �� ���� ��� => �޼ҵ� �������̵�
	/*
	 * �޼ҵ� ���ٶ��̵��̶�? => "���" ������ ��� �θ� Ŭ������  �޼ҵ��̸���
	 * 						�ڽ� Ŭ������ �޼ҵ� �̸��� ������ 	
	 */
	public void speedUp(int velocity) {
		speed = speed + velocity;
	//�ӵ��� ������ �д�.
		if(speed > 100) {  //��ӵ��� ��μ��̶� ��������
			speed = 100;
	}
}
	
	public static void main(String[] args) {
		PassengerCar myCar = new PassengerCar();
		myCar.speedUp(130);
		System.out.println("PassengerCar speed is " +myCar.speed);
		//PassengerCar speed is 100 ��� ��
	}

}
