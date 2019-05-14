package ru.stylliaga;

class Some implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 13; i++){
            System.out.println(i);
        }
    }
}

public class Inter {
    public static void main(String[] args) {
        Thread new_one = new Thread(new Some());
        Thread new_two = new Thread(new Some());

        new_one.start();
        new_two.start();

    }
}
