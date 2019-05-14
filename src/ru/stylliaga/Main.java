package ru.stylliaga;
class  SomeThread extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
}
public class Main {

    public static void main(String[] args) {
		SomeThread test = new SomeThread();
		test.run();

		SomeThread test1 = new SomeThread();
		test1.run();

		Thread t1 = new Thread(new Thread(){
			@Override
			public void run(){
				for(int i = 0; i < 10; i++){
					System.out.println(i);
				}
			}
		});
		t1.start();
    }
}
