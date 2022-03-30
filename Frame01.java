package d_package;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // JFrame 기본 생성
		JPanel panel = new JPanel(); // 패널을 하기위해 패널생성
										// 따로 집어넣어야 한다. 위 frame과는 다른 종류이다.
		
		panel.add(new JLabel("Hello JFrame")); // 패널변수에 입력문 출력하는 방법
		frame.add(panel); // 이와같이 안에 소속되게 넣을 수 있다.
		

		frame.setVisible(true); // 트루를 설정하면 실행시 frame 이 윈도우에 뜨게된다. 기본은 false 이다.
		frame.setPreferredSize(new Dimension(840, 840 / 12 * 9)); // 이렇게 출력이 된다면 좋겠다 라는 의미
		// 치수 (가로,세로) //선호하는 크기를 설정하는 것이다.
		frame.setSize(840, 840 / 12 * 9); // 실행시 크기가 어떻게 띄워질 것인가.
		frame.setLocationRelativeTo(null);// 실행시 어느 위치에서 화면이 띄워질 것인가?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 띄워둔 JFeame 종료시 프로그램 실행 중지

		frame.setResizable(true);// 화면의 조정을 하지 못하게 하기 true면 조정이 가능해진다.

	}

}
