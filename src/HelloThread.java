public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}

/**
 *
 * 자바는 많은 것을 객체로 다룬다. 자바가 예외를 객체로 다루듯이, 스레드도 객체로 다룬다.
 * 각 스레드별로 하나의 실행 스택이 생성된다. 따라서 스레드 수 만큼 스택이 생성된다.
 *
 */

