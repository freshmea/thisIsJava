package button;

public class CallListenner implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
