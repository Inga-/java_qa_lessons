
public class IfElseStatment {
	final static int RAIN = 0;
	final static int OVERCAST = 1;
	final static int SUNNY = 2;
	
	public static void main(String[] args) {
		int weather = SUNNY; // ������ ����
		
		// ������� ���� 
		System.out.println("----==== if/else ������� ====----");
		if (weather == SUNNY) {
			System.out.println("���� �� ����");
		} else if (weather == OVERCAST) {
			System.out.println("���������� � �����");
		} else if (weather == RAIN) {
			System.out.println("����� ����");
		} else {
			System.out.println("��������� �����-�� �������");
		}
		
		// switch
		System.out.println("---==== ���� ����� ������� �� �� switch ====----");
		switch (weather) {
		case SUNNY:
			System.out.println("���� �� ����");
			break;
		case OVERCAST:
			System.out.println("���������� � �����");
			break;
		case RAIN:
			System.out.println("����� ����");
			break;
		default:
			System.out.println("��������� �����-�� �������");
			break;
		}

	}

}
