package net.validcat.atm;

import net.validcat.collections.Box;
import net.validcat.interfaces.IBoxWork;

public class Policmen {

	private ATM atm;

	public void useBankomat(ATM atm) {
		this.atm = atm;
	}

	public void sumBox() {
		if (atm == null) {
			System.out.println("��, �����, � ��������� � ���������");
		} else {
//			IBoxWork sum = atm.getMoneySumFromBox(); // NullPointerException
//			System.out.println("����� � ���������:" + sum);
		}
	}

	public void sizeBox() {
//		IBoxWork size  = atm.getSizeBox();
//		System.out.println("������ �����:" + size);
	}
}
